package com.Barath.Matrixs;

public class ReverseTheColumn {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5,},
                {6,7,8,9,10,},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}};
        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr.length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        reverse(arr);
        System.out.println("After reversing");
        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr.length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void reverse(int[][] arr){
        int len = arr[0].length;
        for (int i=0;i< arr.length;i++){
            int left = 0;
            int right = len - 1;
            while (left < right){
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left ++;
                right --;
            }
        }
    }
}
