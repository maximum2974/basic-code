package com.maximum.myLeetCode;

import java.util.*;

public class Solution {
    public int[] dailyTemperatures(int[] temperatures){
        int len = temperatures.length;
        int[] res = new int[len];
        Deque<Integer> stack = new LinkedList<>();
        stack.push(0);
        for (int i = 1; i < len; i++) {
            if(temperatures[i] <= temperatures[stack.peek()]){
                stack.push(i);
            }else{
                while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                    res[stack.peek()] = i - stack.peek();
                    stack.pop();
                }
                stack.push(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] temperatures = {73,74,75,71,69,72,76,73};
        int[] result = solution.dailyTemperatures(temperatures);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
