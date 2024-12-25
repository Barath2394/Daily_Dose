package com.Barath.Arrays.SlidingWindow;

public class SlidingWindows {
    public static void main(String[] args) {
        int[] arr = {-1,2,3,3,4,5,-1};
        int res = findMax(arr,4);
        System.out.println(res);
    }
    static int findMax(int[] arr,int k){
        int wsum = 0;
        int maxSum = Integer.MAX_VALUE;
        for (int i=0;i<k;i++){
            wsum += arr[i];
        }
        System.out.println(wsum);
        for (int i=k;i< arr.length;i++){
            wsum = wsum - arr[i-k] + arr[i];
            maxSum = Math.max(maxSum,wsum);

        }
        return maxSum;
    }
}
