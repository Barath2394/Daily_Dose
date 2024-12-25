package com.Barath.Arrays;

public class MaxProductSubArray {
    public static void main(String[] args) {
        int[] arr = {1,6,-5,2,8,-1,9,-2,4,8};
        int res = optimal(arr);
        System.out.println(res);

    }
    static int brute(int[] arr){
        int maxpro = Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            int pro = 1;
            for(int j=i;j< arr.length;j++){
                pro *= arr[j];
                maxpro = Math.max(maxpro, pro);
            }
        }
        return maxpro;
    }
    static int optimal(int[] arr){
        int pre = 1,suf = 1;
        int n = arr.length,maxPro = Integer.MIN_VALUE;

        for (int i=0;i<n;i++){
            if(pre == 0) pre = 1;
            if(suf == 0) suf = 1;
            pre *= arr[i];
            suf *= arr[n-i-1];
            maxPro = Math.max(maxPro, Math.max(pre, suf));
        }
        return maxPro;
    }
}
