package com.Barath.PatternPrinting;

public class P16_Cross {
    public static void main(String[] args) {
        P16(7);
    }
    static void P16(int n) {
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                if ((i == j) || (i+j == n-1)) {
                    System.out.print("* ");
                }

                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
