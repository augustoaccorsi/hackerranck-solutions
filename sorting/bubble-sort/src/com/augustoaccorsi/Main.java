package com.augustoaccorsi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(6, 4, 1));
        countSwaps(list);
    }

    public static void countSwaps(List<Integer> list) {
        int swaps = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if(list.get(j) > list.get(j+1)) {
                    Collections.swap(list, j, j + 1);
                    swaps++;
                }
            }
        }
        System.out.println("Array is sorted in "+swaps+" swaps.");
        System.out.println("First Element: "+list.get(0));
        System.out.println("Last Element: "+list.get(list.size()-1));
    }
}
