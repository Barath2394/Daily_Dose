package com.Barath.Arrays.SlidingWindow;

public class Majority_Ones_3 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,0,1,1,1,0};
        int res = tech(arr,2);
        System.out.println(res);
    }
    static int tech(int[] arr,int k){
        int right = 0,left = 0,maxlen = 0,len = 0,zeros = 0;
        while (right < arr.length){
            if (arr[right] == 0){
                zeros ++;
            }
            if (zeros > k){
                if (arr[left] == 0){
                    zeros --;
                }
                left ++;
            }
            if (zeros <= k){
                len = right - left + 1;
                maxlen = Math.max(len,maxlen);
            }
            right ++;
        }
        return maxlen;
    }
}
