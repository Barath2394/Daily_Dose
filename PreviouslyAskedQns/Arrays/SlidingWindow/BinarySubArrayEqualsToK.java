package com.Barath.Arrays.SlidingWindow;

public class BinarySubArrayEqualsToK {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,0};
        int res = tech(arr,2);
        System.out.println(res);
    }
    static int tech(int[] arr,int k){
        int left = 0,right = 0,count = 0,sum = 0;
        while (right < arr.length){
            sum += arr[right];
            if (sum > k){
                sum -= arr[left];
                left ++;
            }
            if(sum == k){
                count += (right-left+1);
            }
            right ++;
        }
        return count;
    }
}
