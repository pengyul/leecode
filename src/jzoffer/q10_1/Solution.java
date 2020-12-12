package jzoffer.q10_1;

public class Solution {
    public static int fib(int n) {
        int[] fibs = new int[n];
        for (int i = 0; i < n; i++) {
            if(i==0) fibs[i] = 0;
            else if(i==1) fibs[i] = 1;
            else fibs[i] = (fibs[i-1] + fibs[i-2]) % 1000000007;
        }
        return fibs[n-1];
    }

    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
