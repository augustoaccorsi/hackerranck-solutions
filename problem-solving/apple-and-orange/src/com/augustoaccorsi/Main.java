package com.augustoaccorsi;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    int startHouse = 7, endHouse = 10, apple = 4, orange = 12;
        int[] apples = {2,3,-4}, oranges = {3,-2,4};
        List<Integer> applesList = Arrays.stream(apples).boxed().toList();
        List<Integer> orangeList = Arrays.stream(oranges).boxed().toList();

        countApplesAndOranges(startHouse,endHouse, apple, orange, applesList, orangeList);
    }

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int countApple = 0, countOrange = 0;

        for(Integer value: apples){
            if((value + a >= s) && (value + a <= t))
                countApple++;
        }

        for(Integer value: oranges){
            if((value + b >= s) && (value + b <= t))
                countOrange++;
        }

        System.out.println(countApple);
        System.out.println(countOrange);
    }
}
