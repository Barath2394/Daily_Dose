package com.Barath.PatternPrinting;

public class P2 {
    public static void main(String[] args) {
        printP2(5);
    }
    static void printP2(int n) {
        for (int i=0;i<n;i++) {
            for (int j=0;j<i+1;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
