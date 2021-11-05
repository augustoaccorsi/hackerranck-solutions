package com.augustoaccorsi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    System.out.println(makeAnagram("cde","abc"));
    }

    private static boolean isAnagram(List<String> a, List<String> b){
        if (a.size() != b.size())
            return false;

        Collections.sort(a);
        Collections.sort(b);

        return a.equals(b);
    }

    public static int makeAnagram(String a, String b) {
        String[] first = a.split("");
        String[] second = b.split("");

        List<String> firstList = new ArrayList<>(Arrays.asList(first));
        List<String> secondList = new ArrayList<>(Arrays.asList(second));

        int deletions = 0, index = 0;

        while(!isAnagram(firstList, secondList)){
            if(!secondList.contains(firstList.get(index))){
                firstList.remove(firstList.get(index));
                deletions++;
            }
            if(!firstList.contains(secondList.get(index))){
                secondList.remove(secondList.get(index));
                deletions++;
            }
            index++;
        }

        System.out.println(firstList);
        System.out.println(secondList);

        return deletions;
    }
}
