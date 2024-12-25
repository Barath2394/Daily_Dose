package com.Barath.Matrixs;

public class Spiral_Matrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5},
                       {6,7,8,9,10},
                       {11,12,13,14,15},
                       {16,17,18,19,20},
                       {21,22,23,24,25}};
        printSprial(arr);
    }
    static void printSprial(int[][] arr){
        int row = arr.length,col = arr[0].length;
        int left = 0,right = col-1;
        int top = 0,bottom = row - 1;

        while(left <= right && top <= bottom){
            //        left to right
            for (int i=left;i<=right;i++){
                System.out.print(arr[top][i] + " ");
            }
            System.out.println();
            top ++;

//        top to bottom
            for (int i=top;i<=bottom;i++){
                System.out.print(arr[i][right] + " ");
            }
            System.out.println();
            right --;

//        right to left
            if(top <= bottom){
                for (int i=right;i>=left;i--){
                    System.out.print(arr[bottom][i] + " ");
                }
                System.out.println();
                bottom --;
            }

//        bottom to top
            if(left <= right){
                for (int i=bottom;i>=top;i--){
                    System.out.print(arr[i][left] + " ");
                }
                System.out.println();
                left ++;
            }
        }
    }
}
