package com.Barath.PatternPrinting;

public class P15_ConcentricPattern {
    public static void main(String[] args) {
        printP15(3);
    }
    static void printP15(int n) {
        for (int i=0;i<(2*n)-1;i++) {
            for (int j=0;j<(2*n)-1;j++) {
                System.out.print("* ");
            }
           System.out.println();
        }
    }
}
