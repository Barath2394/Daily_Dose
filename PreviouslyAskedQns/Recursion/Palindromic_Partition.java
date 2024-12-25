package com.Barath.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Palindromic_Partition {
    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(findPalindromeSubStrings(s));
    }
    static List<List<String>> findPalindromeSubStrings(String s) {
        List<List<String>> all = new ArrayList<>();
        func(s,new ArrayList<>(),all,0);
        return all;
    }
    static void func(String s, List<String> ans,List<List<String>> all,int ind) {
        if (ind == s.length()) {
            all.add(new ArrayList<>(ans));
            return;
        }
        for (int i=ind;i<s.length();i++) {
            if(isPalindrome(s,ind,i)) { // checking if the substring is palindrome
                ans.add(s.substring(ind,i+1)); // adding the substring to the list
                func(s,ans,all,ind+1); // recursive call
                ans.remove(ans.size()-1);
            }
        }
    }
    static boolean isPalindrome(String s,int start,int end) {
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }
}
