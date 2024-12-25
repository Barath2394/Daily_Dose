package com.Barath.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Phone_Number {
    static String[] arr = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        List<String> all = new ArrayList<>();
        com("846",new StringBuilder(),all,0);
        System.out.println(all);
    }
    static void com(String digit,StringBuilder ans,List<String> all,int index){
        if(index == digit.length()){
            all.add(ans.toString());
            return;
        }
        String key = arr[digit.charAt(index) - '0'];
        for (int i=0;i<key.length();i++){
            ans.append(key.charAt(i));
            com(digit,ans,all,index+1);
            ans.deleteCharAt(ans.length()-1);
        }
    }
}
