package com.Barath.Matrixs;

public class Transpose {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5,},
                       {6,7,8,9,10,},
                       {11,12,13,14,15},
                       {16,17,18,19,20},
                       {21,22,23,24,25}};
        transpose(arr);
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr.length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
    static void transpose(int[][] arr){
        for (int i=0;i< arr.length-1;i++){
            for (int j=i+1;j< arr.length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
}
