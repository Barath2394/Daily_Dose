package com.Barath.Matrixs;

public class RotateImage {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        rotate(arr);
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr.length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void rotate(int[][] arr){
        transpose(arr);
        for (int i=0;i< arr.length;i++){
            int left = 0;
            int right = arr[0].length-1;
            while(left < right){
                 int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left ++;
                right --;
            }
        }
    }

    private static void transpose(int[][] arr) {
        for (int i=0;i< arr.length-1;i++){
            for (int j=i+1;j< arr.length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
}
