package jzoffer.q09;

import java.util.Stack;

public class CQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public CQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        while (!stack1.empty()){
            Integer num = stack1.pop();
            stack2.push(num);
        }
        stack1.push(value);
        while (!stack2.empty()){
            Integer num = stack2.pop();
            stack1.push(num);
        }
    }

    public int deleteHead() {
         if (stack1.empty()) return -1;
         else return stack1.pop();
    }
}
