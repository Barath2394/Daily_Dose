package com.Barath.PatternPrinting;

public class P17_Plus {
    public static void main(String[] args) {
        P17(7);
    }
    static void P17(int n) {
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                if (i == n/2 || j == n/2) {
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
