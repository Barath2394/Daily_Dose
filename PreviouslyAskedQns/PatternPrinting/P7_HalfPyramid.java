package com.Barath.PatternPrinting;

public class P7_HalfPyramid {
    public static void main(String[] args) {
        printP7(5);
    }
    static void printP7(int n) {
        for (int i=0;i<n;i++) {
            for (int s=0;s<n-i-1;s++) {
                System.out.print("  ");
            }
            for (int j=0;j<i+1;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
