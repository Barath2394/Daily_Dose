package com.Barath.Strings;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
    public static void main(String[] args) {
        String jewel = "aAb";
        String stones = "aaAAbb";
        System.out.println(find(jewel, stones));
    }
    static int find(String jewel,String stones) {
        Set<Character> set = new HashSet<>();

        for (int i=0;i<jewel.length();i++) {
            set.add(jewel.charAt(i));
        }
        int count = 0;
        for (int i=0;i<stones.length();i++) {
            if (set.contains(stones.charAt(i))) count ++;
        }
        return count;
    }
}
