package com.Barath.Arrays;

import java.util.HashMap;

public class UniqueElements {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {3,4,5,6};
        findUniqueElements(arr1,arr2);
    }
    static void findUniqueElements(int[] arr1,int[] arr2) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for (int i=0;i<arr1.length;i++) {
            mpp.put(arr1[i],mpp.getOrDefault(arr1[i],0)+1);
        }
        for (int i=0;i<arr2.length;i++) {
            mpp.put(arr2[i],mpp.getOrDefault(arr2[i],0)+1);
        }
        for (int key : mpp.keySet()) {
            if (mpp.get(key) == 1) {
                System.out.print(key + " ");
            }
        }
    }
}
