package com.Barath.Arrays.SlidingWindow;

public class SecondMethod {
    public static void main(String[] args) {
        int[] arr = {-1,2,3,3,4,5,-1};
        int res = tech(arr,4);
        System.out.println(res);
    }

    private static int tech(int[] arr, int k) {
        int sum = 0,max = 0;
        int l = 0,r = k-1,n = arr.length-1;
        for (int i=0;i<k;i++){
            sum += arr[i];
        }
        while (r < n){
            sum -= arr[l];
            l ++;
            r ++;
            sum += arr[r];
            max = Math.max(sum,max);
        }
        return max;
    }
}
