package com.Barath.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutation_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(findPermutation(arr));
    } 
    static List<List<Integer>> findPermutation(int[] arr) {
        List<List<Integer>> all = new ArrayList<>();
        permutation(all,0,arr);
        return all;
    }
    static void permutation(List<List<Integer>> all,int ind,int[] arr) {
        if (ind == arr.length) {
            ArrayList<Integer> ans = new ArrayList<>();
            for (int i=0;i<arr.length;i++) {
                ans.add(arr[i]);
            }
            all.add(new ArrayList<>(ans));
            return;
        }
        for (int i=ind;i< arr.length;i++) {
            swap(arr,ind,i);
            permutation(all,ind+1,arr);
            swap(arr,ind,i);
        }
    }
    static void swap(int[] arr,int start,int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
