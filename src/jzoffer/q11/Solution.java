package jzoffer.q11;

public class Solution {
    public int minArray(int[] numbers) {
        int len = numbers.length;
        if(len == 1) return numbers[0];
        for(int i = 1; i < len; i++) {
            if (numbers[i] < numbers[i - 1]) return numbers[i];
        }
        return numbers[0];
    }
}
