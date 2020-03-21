package com.dataplay.data.Stack;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

    public static class Solution {
        public static boolean hasCycle(ListNode head) {
            if (head == null) {
                return false;
            }
            ListNode slow = head;
            ListNode fast = head.next;
            while (fast != null && fast.next != null) {
                if (slow.equals(fast)) {
                    return true;
                }
                slow = slow.next;
                fast = fast.next.next;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(0);
        System.out.println(Solution.hasCycle(node));
    }

}
