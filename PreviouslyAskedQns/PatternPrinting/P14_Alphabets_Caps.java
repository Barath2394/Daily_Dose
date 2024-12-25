package com.Barath.PatternPrinting;

public class P14_Alphabets_Caps {
    public static void main(String[] args) {
        printP14(5);
    }
    static void printP14(int n) {
        char ch = 'A';
        for (int i=0;i<n;i++) {
            for (int j=0;j<i+1;j++) {
                System.out.print(ch + " ");
                ch ++;
            }
            System.out.println();
        }
    }
}
