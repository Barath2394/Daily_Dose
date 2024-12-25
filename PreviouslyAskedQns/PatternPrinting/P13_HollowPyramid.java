package com.Barath.PatternPrinting;

public class P13_HollowPyramid {
    public static void main(String[] args) {
        printP13(5);
    }
    static void printP13(int n) {
        for (int i=0;i<n;i++) {
            for (int s=0;s<n-i-1;s++) {
                System.out.print("  ");
            }
            for (int j=0;j<2*i+1;j++) {
                if (j == 0 || j == 2*i || i == n-1) {
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
