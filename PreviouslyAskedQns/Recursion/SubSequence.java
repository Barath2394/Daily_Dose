package com.Barath.Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSequence {
    static List<String> all = new ArrayList<>();
    public static void main(String[] args) {
        sub("abc","");
        System.out.println(all);
    }
    static void sub(String s,String ans){
        if(s.length() == 0){
            all.add(ans);
            return;
        }
        sub(s.substring(1),ans+s.charAt(0));
        sub(s.substring(1),ans);
    }
}
