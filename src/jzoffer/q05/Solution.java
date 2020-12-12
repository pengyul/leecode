package jzoffer.q05;

public class Solution {
    public static String replaceSpace(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == ' ') stringBuilder.append("%20");
            else stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace("I love U"));
    }
}
