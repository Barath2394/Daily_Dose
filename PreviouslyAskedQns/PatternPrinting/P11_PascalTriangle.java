package com.Barath.PatternPrinting;

public class P11_PascalTriangle {
    public static void main(String[] args) {
        for (int row=1;row<=5;row++) {
            generateRows(row);
        }
    }
    static void generateRows(int row) {
        int ans = 1;
        System.out.print(ans + " ");
        for (int col=1;col<row;col++) {
            ans *= (row-col);
            ans /= col;
            System.out.print(ans + " ");
        }
        System.out.println();
    }
}
