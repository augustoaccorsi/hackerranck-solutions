package com.augustoaccorsi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] candles = new int[]{3,2,1,3};
        List<Integer> candlesList = Arrays.stream(candles).boxed().toList();

        System.out.println(birthdayCakeCandles(candlesList));
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        return Collections.frequency(candles, Collections.max(candles));
    }
}
