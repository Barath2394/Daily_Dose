package com.Barath.Arrays;

public class Sum_of_num_to_array {
    public static void main(String[] args) {
        int[] arr = {2,2,9};
        int add = 123;
        int res = arrSum(arr,add);
        makearr(arr,res);
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
    static int arrSum(int[] arr,int add){
        int sum = 0;
        int current = 1;
        for (int i=arr.length-1;i>=0;i--){
            int rc = arr[i] * current;
            sum += rc;
            current *= 10;
        }
        return sum + add;
    }
    static void makearr(int[] arr,int res){
        for (int i=arr.length-1;i>=0;i--){
            int last = res %10;
            arr[i] = last;
            res /= 10;
        }
    }
}
