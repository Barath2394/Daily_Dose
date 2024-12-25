package com.Barath.Strings;

import java.util.ArrayList;
import java.util.List;

public class Palindromic_Partition {
    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(findAllThePalindromicSubString(s));
    }
    static List<List<String>> findAllThePalindromicSubString(String s) {
        List<List<String>> all = new ArrayList<>();
        func(s,all,new ArrayList<>(),0);
        return all;
    }
    static void func(String s,List<List<String>> all,List<String> ans,int ind) {
        if (ind == s.length()) {
            all.add(new ArrayList<>(ans));
            return;
        }
        for (int i=ind;i<s.length();i++) {
            if (isPalindrome(s,ind,i)) {
                ans.add(s.substring(ind,i+1));
                func(s,all,ans,ind+1);
                ans.remove(ans.size()-1);
            }
        }
    }
    static boolean isPalindrome(String s,int start,int end) {
        while(start <= end) {
            if (s.charAt(start) != s.charAt(end)) return false;
            start ++;
            end --;
        }
        return true;
    }
}
