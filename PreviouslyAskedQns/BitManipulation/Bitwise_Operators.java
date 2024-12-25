package com.Barath.BitManipulation;

public class Bitwise_Operators {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        bitOperations(a,b);
    }
    static void bitOperations(int a,int b) {
        System.out.println(a | b); // Bitwise OR
        System.out.println(a & b); //Bitwise AND
        System.out.println(a ^ b); //Bitwise XOR
        System.out.println(a << b); //Bitwise leftShift
        System.out.println(a >> b); //Bitwise rightShift
    }
}
