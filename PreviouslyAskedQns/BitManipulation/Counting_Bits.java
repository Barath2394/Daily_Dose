package com.Barath.BitManipulation;

import java.util.Scanner;

public class Counting_Bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        for (int i : find(n)) {
            System.out.print(i + " ");
        }
    }
    static int[] find(int n) {
        int[] ans = new int[n+1];
        for (int i=1;i<=n;i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }
}