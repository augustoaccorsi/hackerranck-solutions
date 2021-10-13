package com.augustoaccorsi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,3,2,6,1,2));
        int divisible = 3;

        System.out.println(divisibleSumPairs(arr.size(),divisible,arr));
    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int count = 0;
        for(int i = 0; i < ar.size(); i++){
            for(int j = i+1; j < ar.size(); j++){
                if(i < j && ((ar.get(i)+ar.get(j))%k == 0))
                    count ++;
            }
        }
        return count;
    }
}
