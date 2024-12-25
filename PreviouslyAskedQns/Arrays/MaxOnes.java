package com.Barath.Arrays;

public class MaxOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,0,0,1,1,1,1,1,1};
//        int res = nave(arr);
        int res = efficient(arr);
        System.out.println(res);

    }

    private static int nave(int[] arr) {
        int max = 0;
        for (int i=0;i< arr.length;i++){
            int count = 0;
            for (int j=i;j< arr.length;j++){
                if(arr[j] == 1){
                    count ++;
                }
                else{
                    break;
                }
            }
            max = Math.max(max,count);
        }
        return max;
    }
    static int efficient(int[] arr){
        int maxcount = 0;
        int count = 0;
        for(int i=0;i< arr.length;i++){
            if(arr[i] == 1){
                count ++;
            }
            else{
                count = 0;
            }
            maxcount = Math.max(maxcount,count);
        }
        return maxcount;
    }

}
