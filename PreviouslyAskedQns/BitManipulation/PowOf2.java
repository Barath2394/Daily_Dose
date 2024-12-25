package com.Barath.BitManipulation;

public class PowOf2 {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(kernighanAlgo(n));
    }
    static boolean kernighanAlgo(int n) {
        if (n == 0) return false;
        return (n & (n-1)) == 0;
    }
}
