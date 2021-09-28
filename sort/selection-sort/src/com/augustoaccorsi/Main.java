package com.augustoaccorsi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{3,2,5,7,6,8,9,10,1,4};
        selectionSort(array);
        System.out.println(Arrays.toString(array));

    }

    public static void selectionSort(int[] array){
        List<Integer> auxList = Arrays.stream(array).boxed().collect(Collectors.toList());
        List<Integer> arrayList = new ArrayList<>(auxList);

        int index = 0;
        do{
            int min = Collections.min(auxList);
            auxList.remove((Integer) min);
            arrayList.set(index, min);
            index ++;
        }
        while(index < array.length);

        for(int i = 0; i <array.length; i++){
            array[i] = arrayList.get(i);
        }
    }



}
