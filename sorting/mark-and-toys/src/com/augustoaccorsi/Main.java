package com.augustoaccorsi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> prices = new ArrayList<>(Arrays.asList(1,12,5,111,200,1000,10));
        System.out.println(maximumToys(prices, 50));
    }

    public static int maximumToys(List<Integer> prices, int k) {
        int sum = 0, count = 0, index = 0;
        Collections.sort(prices);

        do{
            if((prices.get(index) + sum) <= k){
                sum += prices.get(index);
                count++;
            }
            else{
                sum = k;
            }
            index++;
        }
        while(sum < k);

        return count;

    }
}
