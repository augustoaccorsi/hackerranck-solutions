package com.augustoaccorsi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    List<Integer> arr = new ArrayList<>(Arrays.asList(2,1,3,1,2));
        System.out.println(countInversions(arr));
    }

        public static long countSwaps(List<Integer> arr, int index1, int index2){
            List<Integer> aux = new ArrayList<>(arr);
            Collections.sort(aux);

            if(arr.equals(aux))
               return 0;
            if(arr.get(index1) > arr.get(index2)){
                Collections.swap(arr, index1, index2);
                return countSwaps(arr, 0, 1) + 1;
            }
            else{
                int newIndex1 = index1 + 1;
                int newIndex2 = index2 + 1;
                return countSwaps(arr, newIndex1, newIndex2);
            }
        }

    public static long countInversions(List<Integer> arr) {
        return countSwaps(arr, 0, 1);
    }
}
