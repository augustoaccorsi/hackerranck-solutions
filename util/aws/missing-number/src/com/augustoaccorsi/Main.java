package com.augustoaccorsi;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	    int[] array = {3,7,1,2,8,4,5};
        System.out.println(findMissingNumber(array));
    }

    public static int findMissingNumber(int[] array){
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        Collections.sort(list);

        for(int i = 0; i < list.size() -1; i++){
            if(list.get(i+1) - list.get(i) != 1)
                return list.get(i)+1;
        }
        return list.get(list.size()-1)+1;
    }

}
