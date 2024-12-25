package com.Barath.PatternPrinting;

public class P12_HollowDiamond {
    public static void main(String[] args) {
        printP12(4);
    }
    static void printP12(int n) {
        int l;
        for (int i=-n;i<=n;i++) {
            if (i < 0) {
                l = i * -1;
            }
            else {
                l = i;
            }
            for (int s=0;s<l;s++) {
                System.out.print(" ");
            }
            for (int j=0;j<n-l+1;j++) {
                if (j == 0 || l+j == n) {
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
