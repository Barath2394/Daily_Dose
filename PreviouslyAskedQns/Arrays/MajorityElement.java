package com.Barath.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {5,3,3,3,5,1,3};
//        int res = find(arr);
//        System.out.println(res);
        int res = effifind(arr);
        System.out.println(res);
    }

    private static int effifind(int[] arr) {
        int maj = arr[0];
        int count = 1;
        for (int i=1;i<arr.length;i++){
            if(arr[i] == maj){
                count ++;
            }
            else {
                count --;
            }
            if(count == 0){
                maj = arr[i];
                count = 1;
            }
        }
        return maj;
    }

    private static int find(int[] arr) {
        for (int i=0;i<arr.length;i++){
            int count = 1;
            for (int j=i+1;j< arr.length;j++){
                if(arr[j] == arr[i]){
                    count ++;
                }
            }
            if(count > arr.length/2){
                return arr[i];
            }
        }
        return -1;
    }
}
