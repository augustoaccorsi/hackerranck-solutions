package com.augustoaccorsi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,3,5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(2,4,6));
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,3,5));
        List<Integer> list4 = new ArrayList<>(Arrays.asList(2,4,6));

        System.out.println(mergeLists(list1, list2));
        System.out.println(mergeLists2(list3, list4));

        int[] array = {9,8,7,6,5,4,3,2,1};
        System.out.println(sortArray(array));
    }

    public static List<Integer> mergeLists(List<Integer> list1, List<Integer> list2){
        list2.addAll(list1);
        Collections.sort(list2);
        return list2;
    }

    public static List<Integer> mergeLists2(List<Integer> list1, List<Integer> list2){
        for(int value:list1){
            for(int i = 0; i < list2.size(); i++){
                if(value < list2.get(0))
                    list2.add(0,value);
                else if(value > list2.get(list2.size()-1))
                    list2.add(list2.size()-1, value);
                else if(value > list2.get(i) && value < list2.get(i+1))
                    list2.add(i+1, value);
            }
        }
        return list2;
    }

    public static List<Integer> sortArray(int[] array){
        boolean sorted = false;
        while(!sorted){
            sorted = true;
            for(int i = 0; i < array.length-1; i++){
                if(array[i] > array[i+1]){
                    int aux = array[i];
                    array[i] = array[i+1];
                    array[i+1] = aux;
                    sorted = false;
                }
            }
        }

        return Arrays.stream(array).boxed().toList();
    }
}
