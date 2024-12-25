package com.Barath.Recursion;

public class



Balanced_Parenthesis {
    public static void main(String[] args) {
        int n = 2;
        char[] arr = new char[n*2];
        find(arr,0,n,0,0);
    }

    private static void find(char[] arr,int i, int n, int o, int c) {
        if(i == arr.length){
            System.out.println(arr);
            return;
        }
        if(o < n){
            arr[i] = '(';
            find(arr,i+1,n,o+1,c);
        }
        if(c < o){
            arr[i] = ')';
            find(arr,i+1,n,o,c+1);
        }
    }
}
