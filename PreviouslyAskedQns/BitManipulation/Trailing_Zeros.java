package com.Barath.BitManipulation;

public class Trailing_Zeros {
    public static void main(String[] args) {
        int n = 168;
        System.out.println(findTz(n));
    }
    static int findTz(int n) {
        return (int)(Math.log10((n & n-1) ^ n) / Math.log10(2));
    }
}
