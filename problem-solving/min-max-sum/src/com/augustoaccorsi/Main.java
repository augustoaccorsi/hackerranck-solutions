package com.augustoaccorsi;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};
        List<Integer> list = Arrays.stream(array).boxed().toList();

        miniMaxSum(list);
    }

    public static void miniMaxSum(List<Integer> arr) {
       long max = Long.MIN_VALUE, min = Long.MAX_VALUE, sum = 0;

       for(int i = 0; i < arr.size(); i++){
           for(int j = 0; j < arr.size(); j++){
                if(i != j)
                    sum += arr.get(j);
           }
           if(sum > max)
               max = sum;
           if(sum < min)
               min = sum;
           sum = 0;
       }

        System.out.println(min+" "+max);
    }
}
