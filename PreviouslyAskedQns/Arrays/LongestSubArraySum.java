package com.Barath.Arrays;

public class LongestSubArraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1,2,2,3};
        int res = tech(arr,6);
        System.out.println(res);
    }
    static int tech(int[] arr,int k){
        int left = 0,right = 0,n = arr.length-1;
        int sum = arr[0];
        int max = 0;
        while (right < n){
            while (sum > k && left <= right){
                sum -= arr[left];
                left ++;
            }
            if(sum == k){
                max = Math.max(max,right-left+1);
            }
            if (right < n) {
                right++;
                sum += arr[right];
            }
        }
        return max;
    }
}
