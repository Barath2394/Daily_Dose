package com.Barath.BitManipulation;

public class BinaryToDecimal {
    public static void main(String[] args) {
        String n = "1010";
        System.out.println(binaryToDecimal(n));
    }

    static int binaryToDecimal(String n) {
        int res = 0;
        int pow = 1;
        for (int i = n.length()-1;i >= 0;i --) {
            if (n.charAt(i) == '1') {
                res += pow;
            }
            pow *= 2;
        }
        return pow;
    }
}
