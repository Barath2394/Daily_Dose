package com.Barath.BitManipulation;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("Before swapping : ");
        System.out.println("Number1 : " + n1);
        System.out.println("Number2 : " + n2);
        swap(n1,n2);
    }
    static void swap(int n1,int n2) {
        n1 = n1 ^ n2;
        n2 = n1 ^ n2;
        n1 = n1 ^ n2;
        System.out.println("After swapping : ");
        System.out.println("Number1 : " + n1);
        System.out.println("Number2 : " + n2);
    }
}

