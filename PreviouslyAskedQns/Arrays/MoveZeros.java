package com.Barath.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0,2,0,4,5};
        move(arr);
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
    static void move(int[] arr){
        int nz = 0;
        for(int i=0;i< arr.length;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[nz];
                arr[nz] = temp;
                nz++;
            }
        }
    }
}
