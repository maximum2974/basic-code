package com.maximum.myDraft;

import java.util.*;

public class Solution {
    private static boolean check(String str){
        int len = str.length();
        char[] array = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        if(array[0] != '{'){
            return false;
        }
        stack.push(array[0]);
        for (int i = 1; i < len; i++) {
            if(array[i] == '{'){
                stack.push(array[i]);
            }else{
                if(stack.peek() == '{'){
                    stack.pop();
                }else{
                    stack.push(array[i]);
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        
    }
}