package com.Barath.Recursion;

public class Sub_Set_Sum {
    public static void main(String[] args) {
        int[] arr = {10,20,15,5};
        int res = subset(arr,25,0);
        System.out.println(res);
    }
    static int subset(int[] arr,int sum,int i){
        if(sum == 0) return 1;
        if(i == arr.length || sum < 0) return 0;
        return subset(arr,sum-arr[i],i+1) + subset(arr,sum,i+1);
    }
}
