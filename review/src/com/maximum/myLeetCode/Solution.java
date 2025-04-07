package com.maximum.myLeetCode;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // 测试用例 1
        int numCourses1 = 2;
        int[][] prerequisites1 = {{1, 0}};
        System.out.println("Test Case 1: " + solution.canFinish(numCourses1, prerequisites1));
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] inDegree = new int[numCourses];
        List<List<Integer>> umap = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            umap.add(new ArrayList<>());
        }
        for (int[] prerequisite : prerequisites) {
            inDegree[prerequisite[0]]++;
            umap.get(prerequisite[1]).add(prerequisite[0]);
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if(inDegree[i] == 0){
                queue.add(i);
            }
        }
        while(!queue.isEmpty()){
            int pre = queue.poll();
            numCourses--;
            for (int cur : umap.get(pre)) {
                if(--inDegree[cur] == 0){
                    queue.add(cur);
                }
            }
        }
        return numCourses == 0;
    }
}
