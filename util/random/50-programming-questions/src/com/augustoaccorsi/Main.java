package com.augustoaccorsi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    private static List<Integer> list;

    public static void main(String[] args) {
	    // 1. How to reverse a String in Java?
        System.out.println(reverseString("THIS IS A TEST, IT WILL BE REVERSED"));
        //2. How to swap two numbers without using a third variable?
        swapNumbers(100,-20);
        //3. Java Program to check if a vowel is present in the string?
        isVowelInString("hy, my name is guto");
        isVowelInString("qwrtyp");
        //4. Java program to check if the given number is Prime?
        System.out.println(isPrime(14));
        System.out.println(isPrime(11));
        //5. Fibonacci Series using recursion
        printFibonacciSeries(4);
        //6. Check if a List of integers contains only odd numbers?
        List<Integer> list = new ArrayList<>(Arrays.asList(1,3,5,57,9));
        System.out.println(containsOnlyOdd(list));
        list = new ArrayList<>(Arrays.asList(1,3,5,2,9));
        System.out.println(containsOnlyOdd(list));
        //7. Palindrome Check
        System.out.println(palindrome("NOT PALINDROME"));
        System.out.println(palindrome("ARARA"));
        //8. How to remove Whitespaces from String
        System.out.println(removeWhiteSpaces("HY, MY NAME IS GUTO"));
        //9. How to remove leading and trailing whitespaces from a string?
        System.out.println(removeLeadingAndTrailingSpaces("\"  abc  def\\t\""));
        //10. Sorting an array in Java?
        int[] array = {43,24,5,1,1,1,1,7};
        int[] array2 = {4,4,53,6};
        System.out.println(sortArray(array));
        //17. Check if two arrays contains same elements?
        System.out.println(sameElement(array, array2));
        //19. Find second largest number in an array?
        System.out.println(secondHighest(array));


    }

    public static String reverseString(String in){
        String[] str = in.split("");
        String result = "";

        for(int i = str.length-1; i >=0; i--)
            result = result.concat(str[i]);

        return result;
    }

    public static void swapNumbers(int a, int b){
        b = b+a;
        a = b-a;
        b = b-a;
        System.out.println(a+" "+b);
    }

    public static void isVowelInString(String str){
        if(str.matches(".*[aeiou].*"))
            System.out.println("Has vowel");
        else
            System.out.println("No vowel");
    }

    public static boolean isPrime(int number) {
        if (number == 0 || number == 1)
            return false;
        if (number == 2)
            return true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static void printFibonacciSeries(int count) {
        int a = 0;
        int b = 1;
        int c = 1;
        for (int i = 1; i <= count; i++) {
            System.out.print(a + ", ");
            a = b;
            b = c;
            c = a + b;
        }
        System.out.println();
    }

    public static boolean containsOnlyOdd(List<Integer> list){
        for(int value: list){
            if(value%2 == 0)
                return false;
        }
        return true;
    }

    public static boolean palindrome(String s){
        String[] str = s.split("");
        for(int i = 0; i <= str.length/2; i++){
            if(!str[i].equals(str[str.length -1 - i]))
                return false;
        }
        return true;
    }

    public static String removeWhiteSpaces(String str){
        return str.replace(" ", "");
    }

    public static String removeLeadingAndTrailingSpaces(String str){
        return str.strip();
    }

    public static List<Integer> sortArray(int[] array){
        List<Integer> result = new ArrayList<>();
        boolean sorted = false;

        while(!sorted){
            sorted = true;
            for(int i = 0; i < array.length-1; i++){
                if(array[i] > array[i+1]){
                    int aux = array[i];
                    array[i] = array[i+1];
                    array[i+1] = aux;
                    sorted = false;
                }
            }
        }

        for(int i = 0; i < array.length-1; i++)
            result.add(array[i]);

        return result;
    }

    public static boolean sameElement(int[] a, int[] b){
        List<Integer> lis1 = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> lis2 = Arrays.stream(b).boxed().collect(Collectors.toList());

        for(int value:lis1){
            if(lis2.contains(value))
                return true;
        }
        return false;
    }

    public static int secondHighest(int[] array){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
//1 2 3 4 5 6
        for(int i = 0; i <= array.length - 1; i++){
            if (array[i] > max){
                secondMax = max;
                max = array[i];
            }
            else if(array[i] < max && array[i] > secondMax)
                secondMax = array[i];
        }

        return secondMax;
    }



}
