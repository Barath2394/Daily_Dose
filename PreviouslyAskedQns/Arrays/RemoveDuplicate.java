package com.Barath.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {2,2,3,4,5,5};
        int res = remove(arr);
        for (int i=0;i<res;i++){
            System.out.print(arr[i] + " ");
        }
    }
    static int remove(int[] arr){
        int rd = 0;
        for (int i=1;i< arr.length;i++){
            if(arr[i] != arr[rd]){
                rd++;
                arr[rd] = arr[i];
            }
        }
        return rd+1;
    }
}
