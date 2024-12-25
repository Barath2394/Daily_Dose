package com.Barath.Arrays;

public class Plus_One {
    public static void main(String[] args) {
        int[] arr = {9,9,1};
        int[] ans = tech(arr);
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
    static int[] tech(int[] arr){
        int n = arr.length;
        for (int i=n-1;i>=0;i--){
            if(arr[i]+1 < 10){
                arr[i] ++;
                return arr;
            }
            else{
                arr[i] = 0;
            }
        }
        int[] newarr = new int[n+1];
        newarr[0] = 1;
        return newarr;
    }
}
