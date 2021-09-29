package com.augustoaccorsi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,10,11};
        List<Integer> arrayList = Arrays.stream(array).boxed().collect(Collectors.toList());
        System.out.println(simpleArraySum(arrayList));
    }


    public static int simpleArraySum(List<Integer> ar) {
        int sum = 0;
        for(Integer value: ar){
            sum += value;
        }
        return sum;
    }
}