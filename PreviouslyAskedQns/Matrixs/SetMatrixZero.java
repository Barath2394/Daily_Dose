package com.Barath.Matrixs;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] arr = {{1,1,1,1},
                       {1,0,1,1},
                       {1,1,0,1},
                       {1,0,0,1}};
        tech(arr);
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void tech(int[][] arr){
        boolean[] row = new boolean[4];
        boolean[] col = new boolean[4];
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                if(arr[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                if(row[i] || col[j]){
                    arr[i][j] = 0;
                }
            }
        }

    }
}
