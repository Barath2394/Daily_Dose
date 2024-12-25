package com.Barath.Arrays.SlidingWindow;

public class SubArrayEqualsToSum {
    public static void main(String[] args) {
        int[] arr = {10,2,4,7,5};

        int[] res = brute(arr,13);
        for (int i : res){
            System.out.print(i + " ");
        }
    }

    private static int[] brute(int[] arr, int k) {
        int sum = 0;
        for (int i=0;i< arr.length;i++){
            sum = arr[i];
            for (int j=i+1;j<= arr.length;j++){
                if(sum == k){
                    return new int[] {i,j-1};
                }
                if(sum > k){
                    break;
                }
                sum += arr[j];
            }
        }
        return new int[]{-1};
    }
}
