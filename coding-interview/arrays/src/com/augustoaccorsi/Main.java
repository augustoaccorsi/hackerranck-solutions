package com.augustoaccorsi;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        // How do you find the missing number in a given integer array of 1 to 100?
        System.out.println(missingNumber());

        //How do you find the duplicate number on a given integer array?
        System.out.println(duplicateNumber());

        //How do you find the largest and smallest number in an unsorted integer array?
        minMax();

    }

    public static int missingNumber(){
        //input
        List<Integer> list = new ArrayList<>();
        Random rand = new Random();
        int n = (rand.nextInt(100) +1);
        for(int i = 0; i < 100; i++){
            if(i+1!=n)
                list.add(i+1);
        }
        Collections.shuffle(list);

        //code
        Collections.sort(list);
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) + 1 != list.get(i+1))
                return list.get(i)+1;
        }
        return 0;
    }

    public static int duplicateNumber(){
        //input
        List<Integer> list = new ArrayList<>();
        Random rand = new Random();
        int n = (rand.nextInt(100) +1);
        for(int i = 0; i < 100; i++)
                list.add(i+1);
        list.add(n);
        Collections.shuffle(list);

        //code
        Collections.sort(list);
        for(int i = 0; i < list.size(); i++){
            if(Objects.equals(list.get(i), list.get(i + 1)))
                return list.get(i);
        }
        return 0;
    }

    public static void minMax(){
        List<Integer> list = new ArrayList<>();
        Random rand = new Random();

        for(int i = 0; i < 100; i++){
            list.add(rand.nextInt(100) +1);
        }

        Collections.sort(list);

        System.out.println("min: "+list.get(0));
        System.out.println("max: "+list.get(list.size()-1));

    }
}
