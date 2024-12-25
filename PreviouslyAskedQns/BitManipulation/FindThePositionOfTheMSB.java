package com.Barath.BitManipulation;

public class FindThePositionOfTheMSB {
    public static void main(String[] args) {
        int m = 5;
        System.out.println(find(m));
    }

    static int find(int m) {
        int n = 1;
        int pos = 0;
        if (m == 0) return -1;
        while ((m & n) == 0) {
            n <<= 1;
            pos ++;
        }
        return pos+1;
    }
}
