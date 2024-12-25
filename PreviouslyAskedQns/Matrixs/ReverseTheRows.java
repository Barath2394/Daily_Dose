package com.Barath.Matrixs;

public class ReverseTheRows {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5,},
                       {6,7,8,9,10,},
                       {11,12,13,14,15},
                       {16,17,18,19,20},
                       {21,22,23,24,25}};
        rev(arr);
        for (int i=0;i<arr.length;i++){
            for (int j=0;j< arr.length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void rev(int[][] arr){
        for (int i=0;i< arr.length;i++){
            int left = 0;
            int right = arr.length - 1;

            while(left < right){
                int temp = arr[right][i];
                arr[right][i] = arr[i][left];
                arr[i][left] = temp;
                
            }
        }
    }
}
