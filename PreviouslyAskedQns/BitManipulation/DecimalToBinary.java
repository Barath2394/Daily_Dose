package com.Barath.BitManipulation;

public class DecimalToBinary {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(convert(n));
    }
    static String convert(int n) {
        String ans = "";
        while(n >= 1) {
            int rem = n % 2;
            ans = rem + ans;
            n /= 2;
        }
        return ans;
    }
}
