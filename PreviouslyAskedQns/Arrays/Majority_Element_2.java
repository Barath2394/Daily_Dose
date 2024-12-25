package com.Barath.Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Majority_Element_2 {
    public static void main(String[] args) {
        int[] arr = {2,1,1,3,1,4,5,6};
        tech(arr);
    }

    private static void tech(int[] arr) {
        int el1 = Integer.MIN_VALUE,el2 = Integer.MIN_VALUE;
        int cn1 = 0,cn2 = 0;
        for (int i=0;i< arr.length;i++){
            if(cn1 == 0 && el2 != arr[i]){
                cn1 = 1;
                el1 = arr[i];
            }
            else if (cn2 == 0 && el1 != arr[i]){
                cn2 = 1;
                el2 = arr[i];
            }
            else if (arr[i] == el1){
                cn1 ++;
            }
            else if (arr[i] == el2){
                cn2 ++;
            }
            else {
                cn1 --;
                cn2 --;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        int c1 = 0,c2 = 0;
        for (int i=0;i< arr.length;i++) {
            if (arr[i] == el1) {
                c1++;
            }
            if (arr[i] == el2) {
                c2++;
            }
        }
        System.out.println(el1 + " "+ el2);
        if (c1 >= arr.length / 3) {
            list.add(el1);
        }
        if (c2 >= arr.length / 3) {
            list.add(el2);
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
