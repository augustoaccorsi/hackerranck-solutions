package com.augustoaccorsi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        int[] array = {1,2,5,5,5,5,5,5,5,5,20};
        highLowIndex(array, 1);
        highLowIndex(array, 2);
        highLowIndex(array, 5);
        highLowIndex(array, 20);
        highLowIndex(array, 111);
    }

    public static void highLowIndex(int[] array, int value){
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        if(Collections.frequency(list, value) == 1) {
            System.out.println("HIGH: "+list.indexOf(value)+" MIN:"+list.indexOf(value));
            return;
        }
        int max = -1, min = -1;
        for(int i = 0; i < list.size()-1; i ++){
            if(min == -1 && list.get(i) == value){
                min = i;
            }
            if(list.get(i) == value){
                max = i;
            }
        }
        if(min > -1)
            System.out.println("HIGH: "+max+" MIN:"+min);
        else
            System.out.println("-1");
    }
}
