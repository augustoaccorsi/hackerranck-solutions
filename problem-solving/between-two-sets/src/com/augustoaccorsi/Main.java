package com.augustoaccorsi;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] a = {2,6}, b = {24,36};
        List<Integer> aList = Arrays.stream(a).boxed().toList();
        List<Integer> bList = Arrays.stream(b).boxed().toList();

        System.out.println(getTotalX(aList,bList));
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here

    }
}
