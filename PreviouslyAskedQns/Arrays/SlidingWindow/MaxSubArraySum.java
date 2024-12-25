package com.Barath.Arrays.SlidingWindow;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = {-1,3,4,-2};
//        int res = find(arr);
//        System.out.println(res);
        int res = kadanes(arr);
        System.out.println(res);
    }

    private static int kadanes(int[] arr) {
        int sum = arr[0];
        int maxsum = arr[0];
        for (int i=1;i< arr.length;i++){
            if(sum >= 0){
                sum += arr[i];
            }
            else{
                sum = arr[i];
            }
            maxsum = Math.max(sum,maxsum);
        }
        return maxsum;
    }

    private static int find(int[] arr) {
        int maxsum = 0;
        for (int i=0;i< arr.length;i++){
            int sum = 0;
            for (int j=i;j< arr.length;j++){
                sum += arr[j];
                maxsum = Math.max(sum,maxsum);
            }
        }
        return maxsum;
    }

}
