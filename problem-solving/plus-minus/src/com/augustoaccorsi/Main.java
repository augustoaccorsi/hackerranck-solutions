package com.augustoaccorsi;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{-4,3,-9,0,4,1};
        List<Integer> arrayList = Arrays.stream(array).boxed().toList();

        plusMinus(arrayList);
    }

    public static void plusMinus(List<Integer> arr) {
        int zeros = 0, positive = 0, negative = 0;
        for(Integer value: arr){
            if(value > 0)
                positive++;
            else if(value < 0)
                negative++;
            else
                zeros++;
        }

        System.out.printf("%.6f%n", (float)positive/arr.size());
        System.out.printf("%.6f%n", (float)negative/arr.size());
        System.out.printf("%.6f%n", (float)zeros/arr.size());
    }
}
