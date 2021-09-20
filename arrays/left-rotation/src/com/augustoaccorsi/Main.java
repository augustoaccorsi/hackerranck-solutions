package com.augustoaccorsi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        int rotations = 54;
        System.out.println(rotLeft(array, rotations));
    }

    public static List<Integer> rotLeft(List<Integer> array, int rotations) {
         Collections.rotate(array, -rotations);
         return array;
    }
}

