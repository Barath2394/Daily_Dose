package com.Barath.Strings;

public class Remove_Outer_Parenthesis {
    public static void main(String[] args) {
        String str = "(()()(()))";
        System.out.println(removeOuter(str));
    }
    static String removeOuter(String str) {
        int dept = 0;
        StringBuilder ans = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c == '(') {
                if (dept > 0) {
                    ans.append(c);
                }
                dept ++;
            }
            else {
                dept --;
                if (dept > 0) {
                    ans.append(c);
                }
            }
        }
        return ans.toString();
    }
}
