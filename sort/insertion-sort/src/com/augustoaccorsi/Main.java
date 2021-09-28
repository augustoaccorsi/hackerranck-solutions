package com.augustoaccorsi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{3, 2, 5, 7, 6, 8, 9, 10, 1, 4};
        insertionSort(array);
        System.out.println(Arrays.toString(array));

    }

    public static void insertionSort(int[] arr) {
        for (int j = 1; j < arr.length; j++) {
            int key = arr[j];
            int i = j - 1;
            while (i >= 0 && arr[i] > key) {
                arr[i+1] = arr[i];
                i -= 1;
            }
            arr[i+1] = key;
        }
    }
}

