package jzoffer.q06;

import java.util.Stack;

public class Solution {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        int n = 0;
        while (head != null){
            stack.push(head.val);
            head = head.next;
            n++;
        }
        int[] vals = new int[n];
        for (int i = 0; i < n; i++) {
            vals[i] = stack.pop();
        }
        return vals;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}