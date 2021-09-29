package com.augustoaccorsi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	    long[] array = new long[]{1000000001,1000000002,1000000003,1000000004,1000000005};
        List<Long> longArray =Arrays.stream(array).boxed().collect(Collectors.toList());

        System.out.println(aVeryBigSum(longArray));
    }

    public static long aVeryBigSum(List<Long> ar) {
        long sum = 0;

        for(long value: ar){
            sum += value;
        }

        return sum;
    }

}
