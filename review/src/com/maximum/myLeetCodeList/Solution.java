package com.maximum.myLeetCodeList;

import java.math.BigInteger;
import java.util.List;

class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger num1 = BigInteger.ZERO;
        BigInteger num2 = BigInteger.ZERO;
        int i = 0, j = 0;

        while (l1 != null) {
            num1 = num1.add(BigInteger.valueOf(l1.val).multiply(BigInteger.TEN.pow(i)));
            l1 = l1.next;
            i++;
        }

        while (l2 != null) {
            num2 = num2.add(BigInteger.valueOf(l2.val).multiply(BigInteger.TEN.pow(j)));
            l2 = l2.next;
            j++;
        }

        BigInteger sum = num1.add(num2);

        if (sum.equals(BigInteger.ZERO)) {
            return new ListNode(0);
        }

        ListNode dummyNode = new ListNode(0);
        ListNode cur = dummyNode;

        while (!sum.equals(BigInteger.ZERO)) {
            BigInteger[] divRem = sum.divideAndRemainder(BigInteger.TEN);
            int digit = divRem[1].intValue();
            cur.next = new ListNode(digit);
            cur = cur.next;
            sum = divRem[0];
        }

        return dummyNode.next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // 构造链表 l2 = 5 -> 6 -> 4
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        // 执行加法
        ListNode result = solution.addTwoNumbers(l1, l2);
    }
}