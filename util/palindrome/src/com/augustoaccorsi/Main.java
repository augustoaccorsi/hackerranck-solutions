package com.augustoaccorsi;

public class Main {

    public static void main(String[] args) {
	    palindrome("GUTOXOTUG");
        System.out.println(palindrome2("GUTOXOTUG"));
    }

    public static void palindrome(String word){
        String[] words = word.split("");
        boolean process = true;
        int index = 0;
        while(process){
            try{
            if(words[index].equals(words[words.length - 1 - index])){
                index++;
            }
            else {
                System.out.println("Nao é palindrome");
                process = false;
            }
            }catch (Exception e){
                System.out.println("É palindrome");
                process = false;
            }
        }

       /* if(words.length%2 == 0){

        }
        else{

        } */


    }

    public static String palindrome2(String word){
        StringBuilder right;
        String left;
        int length = word.length(), axys = 0;

        if(length%2 == 0)
            axys = length/2;
        else
            axys = (length/2)+1;

        right = new StringBuilder(word.substring(axys,length));
        left = word.substring(0, (length/2));

        if(left.equals(right.reverse().toString()))
            return "É palindrime";
        return "Nao é palindrome";
    }
}
