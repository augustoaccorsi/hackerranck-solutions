package com.augustoaccorsi;

public class Main {

    public static void main(String[] args) {
        System.out.println(reverseWords("AUGUSTO ACCORSI"));
    }

    public static String reverseWords(String s){
        String[] str = s.split(" ");
        String result = "";
        for(int i = str.length-1; i >=0; i--){
            result = result.concat(str[i]);
            if(i != 0)
                result = result.concat(" ");
        }
        return result;
    }
}
