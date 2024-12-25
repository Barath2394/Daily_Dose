package com.Barath.PatternPrinting;

public class P5_Pyramid {
    public static void main(String[] args) {
        printP5(5);
    }
    static void printP5(int n) {
        for (int row=0;row<n;row++) {
            for (int space=0;space<n-row-1;space++) {
                System.out.print("  ");
            }
            for (int star=0;star<(row*2)+1;star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
