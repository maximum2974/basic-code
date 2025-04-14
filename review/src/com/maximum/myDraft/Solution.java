package com.maximum.myDraft;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] nums = new int[len];
        int res = 0;
        if(len == 1){
            System.out.println(scanner.nextInt());
        }
        for (int i = 0; i < len; i++) {
            nums[i] = scanner.nextInt();
            res += nums[i];
            if(i == 0){
                continue;
            }
            if(nums[i] == nums[i - 1] && nums[i] != 1){
                res += (nums[i] - 1);
            }
            if(nums[i] > nums[i - 1] && nums[i - 1] != 1){
                res += (nums[i - 1] - 1);
            }
            if(nums[i] < nums[i - 1]){
                if(nums[i] == 1){
                    res += 1;
                }else{
                    res += (nums[i] - 1);
                }
            }
        }
        System.out.println(res);
    }
}