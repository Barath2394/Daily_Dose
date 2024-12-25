package com.Barath.Arrays;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printsubarray(arr);
    }
    static void printsubarray(int[] arr){
        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr.length;j++){
                for (int k=i;k<=j;k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
