package com.Barath.BitManipulation;

public class OddOrEven {
    public static void main(String[] args) {
        if (isEvenOrOdd(10)) {
            System.out.println(10 + " is even");
        }
        else {
            System.out.println(10 + " is odd");
        }
    }
    static boolean isEvenOrOdd(int n) {
        return ((n & 1) == 0);
    }
}
