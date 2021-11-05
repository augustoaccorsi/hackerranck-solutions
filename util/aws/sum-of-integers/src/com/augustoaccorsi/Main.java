package com.augustoaccorsi;

public class Main {

    public static void main(String[] args) {
        int[] array = {1,2,1,2,1};//{5, 7, 1, 2, 8, 4, 3};
        System.out.println(sumOfIntegers(array, 10));
    }

    public static boolean sumOfIntegers(int[] array, int sum) {
        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = i + 1; j <= array.length - 1; j++) {
                if (array[i] + array[j] == sum)
                    return true;
            }
        }
        return false;
    }
}
