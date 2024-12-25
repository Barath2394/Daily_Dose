package com.Barath.Arrays;

import java.util.HashMap;
import java.util.Map;

public class LuckyNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,4,4,4,4};
        System.out.println(findMaxLucky(arr));
    }
    static int findMaxLucky(int[] arr) {
        Map<Integer,Integer> mpp = new HashMap<>();
        for (int i=0;i< arr.length;i++) {
            mpp.put(arr[i], mpp.getOrDefault(arr[i],0)+1);
        }
        int maxLucky = -1;
        for (int key : mpp.keySet()) {
            if (key == mpp.get(key)) {
                maxLucky = Math.max(key,maxLucky);
            }
        }
        return maxLucky;
    }
}
