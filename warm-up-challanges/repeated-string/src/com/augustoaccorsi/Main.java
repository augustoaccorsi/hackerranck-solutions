package com.augustoaccorsi;

public class Main {

    public static void main(String[] args) {
        String string = "kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm";
        long number = Long.parseLong("736778906400");

        System.out.println(repeatedString(string, number));
    }

    public static long repeatedString(String string, long number) {
        long size = string.length(), repeated = number/size;
        long left = number - (size * repeated);
        int extra = 0, count = 0;
        
        for(char c: string.toCharArray()){
            if(c == 'a'){
                count++;
            }
        }

        for(int i = 0; i < left; i++){
            if(string.charAt(i) == 'a'){
                extra++;
            }
        }

        repeated = (repeated * count) + extra;

        return repeated;
    }
}