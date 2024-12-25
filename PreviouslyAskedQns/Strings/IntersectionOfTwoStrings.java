package com.Barath.Strings;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoStrings {
    public static void main(String[] args) {
        Set<Character> ans = findIntersection("india","china");
        for (char c : ans) {
            System.out.print(c + " ");
        }
    }
    static Set<Character>findIntersection(String str1,String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Set<Character> set1 = new HashSet<>();
        for (char c : arr1) {
            set1.add(c);
        }
        Set<Character> intersectionSet = new HashSet<>();
        for (char c : arr2) {
            if (set1.contains(c)) {
                intersectionSet.add(c);
            }
        }
        return intersectionSet;
    }
}
