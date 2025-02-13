package com.maximum.myLeetCode;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<List<Integer>> umap = new ArrayList<>();
        int[] inDegree = new int[n];

        for (int i = 0; i < n; i++) {
            umap.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int s = scanner.nextInt();
            int t = scanner.nextInt();
            umap.get(s).add(t);
            inDegree[t]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if(inDegree[i] == 0){
                queue.add(i);
            }
        }

        List<Integer> result = new ArrayList<>();

        while(!queue.isEmpty()){
            int cur = queue.poll();
            result.add(cur);
            for (int file : umap.get(cur)) {
                inDegree[file]--;
                if(inDegree[file] == 0){
                    queue.add(file);
                }
            }
        }

        if(result.size() == n){
            for (int i = 0; i < result.size(); i++) {
                System.out.print(result.get(i));
                if(i < result.size() - 1){
                    System.out.println(" ");
                }
            }
        }else{
            System.out.println(-1);
        }
    }
}
