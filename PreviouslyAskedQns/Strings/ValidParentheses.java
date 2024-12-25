package com.Barath.Strings;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String str = "({})[]";
        System.out.println(check(str));
    }
    static boolean check(String str) {
        Stack<Character> st = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(') st.push(')');
            else if (c == '{') st.push('}');
            else if (c == '[') st.push(']');
            else if (st.isEmpty() || st.pop() != c) {
                return false;
            }
        }
        return true;
    }
}
