package com.Barath.Recursion;

public class Lucky_Number {
    public static void main(String[] args) {
        boolean res = lucky(13,2);
        System.out.println(res);
    }
    static boolean lucky(int n,int counter){
        if(n < counter){
            return true;
        }
        if(n % counter == 0){
            return false;
        }
        return lucky(n - n/counter,counter+1);
    }
}
