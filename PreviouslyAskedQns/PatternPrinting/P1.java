package com.Barath.PatternPrinting;

public class P1 {
    public static void main(String[] args) {
        printP1(5);
    }
    static void printP1(int n) {
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
