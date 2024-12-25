package com.Barath.Arrays.SlidingWindow;

public class MaxSumEqualsToK {
    public static void main(String[] args) {
        int[] arr = {7,2,1,1,6,5};
        int res = bruteforce(arr,11);
        System.out.println(res);
    }

    private static int bruteforce(int[] arr, int k) {
        int sum = 0;
        int minlength = Integer.MIN_VALUE;
        for (int i=0;i< arr.length;i++){
            sum = 0;
            for (int j=i;j< arr.length;j++){
                sum += arr[j];
                if(sum >= k){
                    minlength = Math.min(minlength,(j-i)+1);
                    break;
                }
            }
        }
        return minlength;
    }
}
