package com.Barath.Recursion;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int res = binary(arr,0,4,5);
        System.out.println(res);
    }
    static int binary(int[] arr,int low,int high,int key){
        if(low <= high){
            int mid = (low+high) / 2;
            if(arr[mid] == key) return mid;
            else if(arr[mid] < key){
                return binary(arr,mid+1,high,key);
            }
            else {
                return binary(arr,low,mid-1,key);
            }
        }
        return -1;
    }
}
