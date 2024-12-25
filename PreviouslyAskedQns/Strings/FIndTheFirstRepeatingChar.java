package com.Barath.Strings;

import java.util.HashMap;
import java.util.Map;

public class FIndTheFirstRepeatingChar {
    public static void main(String[] args) {
        String str = "abbacc";
        System.out.println(find(str));
    }
    static char find(String str) {
        Map<Character,Integer> mpp = new HashMap<>();
        for (int i=0;i<str.length();i++) {
            char c = str.charAt(i);
            mpp.put(c,mpp.getOrDefault(c,0)+1);
        }
        for (char key : mpp.keySet()) {
            if (mpp.get(key) > 1) return (char) key;
        }
        return '\0';
    }
}
