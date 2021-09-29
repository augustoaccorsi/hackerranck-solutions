package com.augustoaccorsi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // 11 2 4
        //4 5 6
        //10 8 -12
        int[] line1 = new int[]{11,2,4};
        int[] line2 = new int[]{4,5,6};
        int[] line3 = new int[]{10,8,-12};
        List<Integer> list1 = Arrays.stream(line1).boxed().toList();
        List<Integer> list2 = Arrays.stream(line2).boxed().toList();
        List<Integer> list3 = Arrays.stream(line3).boxed().toList();
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(list1); arr.add(list2); arr.add(list3);

        System.out.println(diagonalDifference(arr));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int sumLeft = 0, sumRight = 0;
        for(int i = 0; i < arr.size(); i++){
            sumLeft += arr.get(i).get(i);
            sumRight += arr.get(i).get(arr.size()-1-i);
        }

        return  Math.abs(sumLeft - sumRight);
    }
}
