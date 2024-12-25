package com.Barath.Strings;

public class Valid_Anagram {
    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";
        System.out.println(find(s, t));
    }
    static boolean find(String s,String t) {
        if (s.length() != t.length()) return false;
        int[] freq = new int[26];
        for (int i=0;i<s.length();i++) {
            freq[s.charAt(i) - 'a'] ++;
        }
        for (int i=0;i<t.length();i++) {
            freq[t.charAt(i) - 'a'] --;
        }
        for (int i=0;i<freq.length;i++) {
            if (freq[i] != 0) return false;
        }
        return true;
    }
}
