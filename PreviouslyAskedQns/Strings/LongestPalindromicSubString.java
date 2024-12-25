package com.Barath.Strings;

public class LongestPalindromicSubString {
    public static void main(String[] args) {
        String str = "EBBABAD";
        System.out.println(findLongestPalindrome(str));
    }
    static String findLongestPalindrome(String str) {
        if (str.length() <= 1) return str;
        String lps = "";
        for (int i=0;i<str.length();i++) {
//            Odd length palindromic String
            String oddPalindrome = expandAround(str,i,i);
            if (oddPalindrome.length() > lps.length()) {
                lps = oddPalindrome;
            }
            String evenPalindrome = expandAround(str,i,i+1);
            if (evenPalindrome.length() > lps.length()) {
                lps = evenPalindrome;
            }
        }
        return lps;
    }
    static String expandAround(String str,int low,int high) {
        while (low >= 0 && high < str.length() && str.charAt(low) == str.charAt(high)) {
            low --;
            high ++;
        }
        return str.substring(low+1,high);
    }
}
