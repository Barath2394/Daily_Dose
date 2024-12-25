package com.Barath.BitManipulation;

public class FindTheNoOfOnes {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(kernighanAlgo(n));
    }
    static int kernighanAlgo(int n) {
        int cnt = 0;
        while (n > 0) {
            n = n & (n-1);
            cnt ++;
        }
        return cnt;
    }
}
