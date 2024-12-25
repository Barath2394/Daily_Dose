package com.Barath.Arrays.SlidingWindow;

public class LongestSubArrayLessThanEqualToK {
    public static void main(String[] args) {
        int[] arr = {2,5,1,10,10};
        int res = tech(arr,14);
        System.out.println(res);
    }
    static int tech(int[] arr,int k){
        int left = 0,right = 0,n = arr.length-1;
        int sum = 0,maxlength = 0;
        while (right < n){
            sum += arr[right];
            if(sum > k){
                sum -= arr[left];
                left ++;
            }
            if(sum <= k){
                maxlength = Math.max(maxlength,right-left+1);
            }
            right ++;
        }
        return maxlength;
    }
}
