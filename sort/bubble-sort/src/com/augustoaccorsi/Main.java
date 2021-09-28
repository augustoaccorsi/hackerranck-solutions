package com.augustoaccorsi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{3, 2, 5, 7, 6, 8, 9, 10, 1, 4};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));

    }

    public static void bubbleSort(int[] array) {
        List<Integer> arrayList = Arrays.stream(array).boxed().collect(Collectors.toList());

        int index = 0;
        boolean sorted = false, aux = false;
        do {
            if(arrayList.get(index) > arrayList.get(index+1)){
                Collections.swap(arrayList, index, index+1);
                aux = true;
            }
            if(index == arrayList.size()-2){
                index = 0;
                if(!aux){
                    sorted = true;
                }
                aux = false;
            }
            else {
                index++;
            }
        }
        while (!sorted);

        for (int i = 0; i < array.length; i++) {
            array[i] = arrayList.get(i);
        }
    }
}
