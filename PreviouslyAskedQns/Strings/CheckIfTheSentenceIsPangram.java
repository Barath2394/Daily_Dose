package com.Barath.Strings;

import java.util.HashSet;

public class CheckIfTheSentenceIsPangram {
    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(check(str));
    }
    static boolean check(String s) {
        HashSet<Character> set = new HashSet<>();

        for (int i='a';i<='z';i++) {
            set.add((char) i);
        }
        for (int i=0;i<s.length();i++) {
            set.remove(s.charAt(i));
            if (set.isEmpty()) return true;
        }
        return false;
    }
}
