package com.Barath.Arrays;

import java.util.HashMap;

public class LongestSubArrayWithSumEqualsToK {
    public static void main(String[] args) {
        int[] arr = {1,1,1,3,2};
        System.out.println(findTheLongest(arr,3));
    }
    static int findTheLongest(int[] arr,int k) {
        int maxLen = 0;
        int sum = 0;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for (int i=0;i<arr.length;i++) {
            sum += arr[i];
//            Checking if sum = k
            if (sum == k) {
                maxLen = Math.max(i+1,maxLen);
            }
            int rem = sum - k;
            if (mpp.containsKey(rem)) {
                int len = i - mpp.get(rem);
                maxLen = Math.max(len,maxLen);
            }
            if (!mpp.containsKey(sum)) {
                mpp.put(sum,i);
            }
        }
        return maxLen;
    }
}
