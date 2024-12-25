package com.Barath.Arrays;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {3,4,5,6};
        findInterSection(arr1, arr2);
    }
    static void findInterSection(int[] arr1,int[] arr2) {
        int i=0;
        int j=0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + " ");
                i ++;
                j ++;
            }
            else {
                if (arr1[i] < arr2[j]) {
                    i ++;
                }
                else {
                    j ++;
                }
            }
        }
    }
}
