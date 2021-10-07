package com.augustoaccorsi;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	    System.out.println(sherlockAndAnagrams("abba"));
    }

    public static int sherlockAndAnagrams(String str) {
        StringBuilder sb = new StringBuilder();
        List<String> splited = Arrays.stream(str.split("")).collect(Collectors.toList());

        List<String> spl = new ArrayList<>();

        System.out.println(splited);

       for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                spl.add(str.substring(i,j));
            }
        }

        System.out.println(spl);
       int count = 0;
       for(int i = 0; i < spl.size(); i++){
           for(int j = i+1; j< spl.size(); j++){
               sb = new StringBuilder(spl.get(j));
               if(spl.get(i).equals(sb.reverse().toString())){
                   count++;
               }
           }
       }

        return count;
    }
}
