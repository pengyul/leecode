package stack.q42;

import java.util.Stack;

public class Solution {
    public static int trap(int[] height) {
        int id = 0;
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        while(id < height.length){
            while(!stack.isEmpty() && height[id] > height[stack.peek()]){
                int index = stack.pop();
                if(stack.isEmpty()) break;
                // 高度
                int h = Math.min(height[id], height[stack.peek()]) - height[index];
                // 宽度
                int d = id - stack.peek() - 1;
                result += h*d;
            }
            stack.push(id);
            id++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] height = new int[]{4,2,0,3,2,5};
        System.out.println(trap(height));
    }
}
