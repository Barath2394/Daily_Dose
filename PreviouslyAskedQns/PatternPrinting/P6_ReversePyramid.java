package com.Barath.PatternPrinting;

public class P6_ReversePyramid {
    public static void main(String[] args) {
        printP6(5);
    }
    static void printP6(int n) {
        for (int i=0;i<n;i++) {
            for (int s=0;s<i;s++) {
                System.out.print(" ");
            }
            for (int j=0;j<n-i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
