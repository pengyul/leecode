package jzoffer.q13;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().movingCount(38, 15, 9));
    }
    public int movingCount(int m, int n, int k) {
        boolean[][] flag = new boolean[m][n];
        int count = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0,0,0});
        while (!queue.isEmpty()){
            int[] x = queue.poll();
            if(x[0] >= m || x[1] >= n || x[2] + x[3] > k || flag[x[0]][x[1]]) continue;
            flag[x[0]][x[1]] = true;
            count++;
            queue.add(new int[]{x[0], x[1] + 1, sumDigit(x[0]), sumDigit(x[1] + 1)});
            queue.add(new int[]{x[0] + 1, x[1], sumDigit(x[0] + 1), sumDigit(x[1])});
        }
        return count;
    }
    private int sumDigit(int num) {
        return num/100 + (num%100)/10 + num%10;
    }
}
