package com.Barath.PatternPrinting;

public class P9_Diamond {
    public static void main(String[] args) {
        printP9(3);
    }
    static void printP9(int n) {
        int l;
        for (int i=-n;i<=n;i++) {
            if (i < 0) {
                l = i * -1;
            }
            else {
                l = i;
            }
            for (int s=0;s<l;s++) {
                System.out.print("  ");
            }
            for (int j=0;j<2*(n-l)+1;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
