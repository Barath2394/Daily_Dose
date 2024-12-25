package com.Barath.Recursion;

public class Permutations {
    public static void main(String[] args) {
        String s = "abc";
        char[] arr = s.toCharArray();
        find(arr,0);
    }
    static void find(char[] arr,int fi){
        if(fi == arr.length-1){
            System.out.println(arr);
            return;
        }
        for (int i=fi;i< arr.length;i++){
            swap(arr,i,fi);
            find(arr,fi+1);
            swap(arr,i,fi);
        }
    }

    private static void swap(char[] arr, int i, int fi) {
        char temp = arr[i];
        arr[i] = arr[fi];
        arr[fi] = temp;
    }
}
