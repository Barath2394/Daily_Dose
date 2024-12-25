package com.Barath.Arrays.SlidingWindow;

public class MaxPoint {
    public static void main(String[] args) {
        int[] arr = {6,2,3,7,2,1,7,1};
        int res = tech(arr,4);
        System.out.println(res);
    }
    static int tech(int[] arr,int k){
        int lsum = 0,rsum = 0,maxsum = 0;
        for (int i=0;i<k;i++){
            lsum += arr[i];
        }
        maxsum = lsum;
        int rind = arr.length-1;
        for (int i=k-1;i>=0;i--){
            lsum -= arr[i];
            rsum += arr[rind];
            maxsum = Math.max(maxsum,lsum+rsum);
            rind--;
        }
        return maxsum;
    }
}
