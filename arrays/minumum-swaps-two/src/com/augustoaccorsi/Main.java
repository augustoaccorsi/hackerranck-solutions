package com.augustoaccorsi;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int[] arr = {4,3,1,2};
        System.out.println(minimumSwaps(arr));
    }

    static int minimumSwaps(int[] arr) {
        int index = 0, swap = 0;
        while(index < arr.length){
            if(arr[index] != index+1){
                int aux = arr[index];
                arr[index] = arr[aux-1];
                arr[aux-1] = aux;
                swap++;
            }
            else{
                index++;
            }
        }
        return swap;
    }
}
