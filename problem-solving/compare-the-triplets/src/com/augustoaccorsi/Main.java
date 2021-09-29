package com.augustoaccorsi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        int[] alice = new int[]{17,28,30};
        int[] bob = new int[]{99,16,0};
        List<Integer> aliceList = Arrays.stream(alice).boxed().collect(Collectors.toList());
        List<Integer> bobList = Arrays.stream(bob).boxed().collect(Collectors.toList());

        System.out.println(compareTriplets(aliceList, bobList));
    }

    public static List<Integer> compareTriplets(List<Integer> alice, List<Integer> bob) {
        ArrayList<Integer> result = new ArrayList<>();
        int alicePoints = 0, bobPoints = 0;

        for(int i = 0; i < 3; i++){
            if(alice.get(i) > bob.get(i)){
                alicePoints++;
            }
            else if(alice.get(i) < bob.get(i)){
                bobPoints++;
            }
        }
        result.add(alicePoints);
        result.add(bobPoints);

        return result;
    }
}
