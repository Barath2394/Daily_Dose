package com.Barath.PatternPrinting;

public class P3 {
    public static void main(String[] args) {
        printP3(5);
    }
    static void printP3(int n) {
        for (int i=0;i<n;i++) {
            for (int j=0;j<n-i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
