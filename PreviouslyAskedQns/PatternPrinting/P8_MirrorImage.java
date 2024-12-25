package com.Barath.PatternPrinting;

public class P8_MirrorImage {
    public static void main(String[] args) {
        printP8(4);
    }
    static void printP8(int n) {
        int l;
        for (int i=-n;i<n;i++) {
            if (i < 0) {
                l = i * -1;
            }
            else {
                l = i;
            }
            for (int s=0;s<n-l;s++) {
                System.out.print(" ");
            }
            for (int j=0;j<l+1;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
