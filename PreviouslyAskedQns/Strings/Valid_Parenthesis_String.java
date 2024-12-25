package com.Barath.Strings;

public class Valid_Parenthesis_String {
    public static void main(String[] args) {
        String s = "(*)(*";
        System.out.println(find(s));
    }
    static boolean find(String s) {
        int min = 0,max = 0;

        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) == '(') {
                min ++;
                max ++;
            }
            else if (s.charAt(i) == ')') {
                min --;
                max --;
            }
            else {
                min --;
                max ++;
            }
            if (min < 0) min = 0;
            if (max < 0) return false;
        }
        return min == 0;
    }
}
