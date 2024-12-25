package com.Barath.Strings;

import java.util.HashSet;

public class LongestSubStringWithoutRepeatingChar {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(findLongest(s));
    }
    static int findLongest(String str) {
        int left = 0,right = 0;
        int maxLen = 0;
        HashSet<Character> set = new HashSet<>();
        while (right < str.length()) {
            while (set.contains(str.charAt(right))) {
                if (left < right) {
                    set.remove(str.charAt(left));
                    left ++;
                }
            }
            set.add(str.charAt(right));
            maxLen = Math.max(maxLen,right-left+1);
            right ++;
        }
        return maxLen;
    }
}
