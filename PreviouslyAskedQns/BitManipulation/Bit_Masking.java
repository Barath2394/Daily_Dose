package com.Barath.BitManipulation;

public class Bit_Masking {
    public static void main(String[] args) {
        int n = 36;
        int i = 3;
        onTheBit(n,i);
        ofTheBit(n, i);
    }
    static void onTheBit(int n,int i) {
        int onMasking = 1 << i;
        System.out.println(n | onMasking);
    }
    static void ofTheBit(int n,int i) {
        int ofMasking = ~(1 << i);
        System.out.println(n & ofMasking);
    }
}
