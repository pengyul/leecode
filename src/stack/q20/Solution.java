package stack.q20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.regex.Pattern;

public class Solution {
    public static boolean isValid(String s) {
        if (s.isEmpty()) return true;
        Map<Character,Character> map = new HashMap<>();
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                if(!stack.isEmpty() && stack.peek() == map.get(c)) stack.pop();
                else return false;
            } else stack.push(c);
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("({[]})"));
    }
}
