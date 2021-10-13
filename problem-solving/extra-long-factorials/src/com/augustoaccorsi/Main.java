package com.augustoaccorsi;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        extraLongFactorials(25);
    }

    public static void extraLongFactorials(int n) {
        BigInteger factorial = new BigInteger("1");
        int i = 1;

        while(i <= n) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
            i++;
        }

        System.out.println(factorial);
    }
}
