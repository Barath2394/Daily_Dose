package com.Barath.Arrays;

public class Frequency_of_sorted_array {
    public static void main(String[] args) {
        int[] arr = {10,10,20,20,20,30,30,30,30};
        frequency(arr);
    }
    static void frequency(int[] arr){
        int freq = 1,i = 1;
        while (i < arr.length){
            while (i < arr.length && arr[i] == arr[i-1]){
                freq ++;
                i ++;
            }
            System.out.println(arr[i-1] + " " + freq);
            freq = 1;
            i++;
        }

    }
}
