package com.maximum.tencent;

import java.util.*;

public class IPFilter {
    private final long periodMillis; // 封禁检测周期，毫秒为单位
    private final int threshold;     // 触发封禁的访问次数
    private final Set<String> whiteSet = new HashSet<>();  // 精确白名单
    private final Set<String> blackSet = new HashSet<>();  // 精确黑名单
    private final List<String> whiteWildcard = new ArrayList<>(); // 通配白名单（存前缀）
    private final List<String> blackWildcard = new ArrayList<>(); // 通配黑名单（存前缀）
    private final Map<String, List<Long>> accessRecord = new HashMap<>(); // IP访问记录（时间戳列表）
    private final Map<String, Long> bannedIPs = new HashMap<>(); // IP封禁信息，存封禁到期时间

    /**
     * @param period    周期（单位秒）
     * @param threshold 封禁触发阈值
     * @param whiteList 白名单规则
     * @param blackList 黑名单规则
     */
    public IPFilter(long period, int threshold, String[] whiteList, String[] blackList) {
        this.periodMillis = period * 1000; // 转换为毫秒
        this.threshold = threshold;

        for (String ip : whiteList) {
            if (ip.contains("*")) {
                whiteWildcard.add(ip.replace("*", ""));
            } else {
                whiteSet.add(ip);
            }
        }

        for (String ip : blackList) {
            if (ip.contains("*")) {
                blackWildcard.add(ip.replace("*", ""));
            } else {
                blackSet.add(ip);
            }
        }
    }

    /**
     * 判断传入的IP是否可以通过
     */
    public boolean doFilter(String ip) {
        long now = System.currentTimeMillis();

        // 1. 检查是否在封禁列表
        if (bannedIPs.containsKey(ip)) {
            if (now < bannedIPs.get(ip)) {
                return false; // 正在封禁中
            } else {
                bannedIPs.remove(ip); // 封禁期结束，解除封禁
            }
        }

        // 2. 检查白名单
        if (whiteSet.contains(ip) || matchesWildcard(ip, whiteWildcard)) {
            return true;
        }

        // 3. 检查黑名单
        if (blackSet.contains(ip) || matchesWildcard(ip, blackWildcard)) {
            return false;
        }

        // 4. 限流逻辑：记录访问时间
        accessRecord.putIfAbsent(ip, new LinkedList<>());
        List<Long> timestamps = accessRecord.get(ip);

        // 移除过期的访问记录（不在周期内的）
        timestamps.removeIf(t -> t <= now - periodMillis);

        // 添加当前访问
        timestamps.add(now);

        // 检查访问次数是否超阈值
        if (timestamps.size() > threshold) {
            // 超过阈值，封禁2倍周期
            bannedIPs.put(ip, now + 2 * periodMillis);
            accessRecord.remove(ip); // 清除记录，防止内存泄漏
            return false;
        }

        return true; // 放行
    }

    /**
     * 工具方法：检查IP是否匹配某个通配符前缀
     */
    private boolean matchesWildcard(String ip, List<String> wildcardList) {
        for (String prefix : wildcardList) {
            if (ip.startsWith(prefix)) {
                return true;
            }
        }
        return false;
    }
}