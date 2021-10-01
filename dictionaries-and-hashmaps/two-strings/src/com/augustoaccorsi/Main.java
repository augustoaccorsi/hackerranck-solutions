package com.augustoaccorsi;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    System.out.println(twoStrings("cnd", "art"));
    }

    public static String twoStrings(String s1, String s2) {
        Map<String, Integer> firstStringMap = new HashMap<>();
        Map<String, Integer> secondStringMap = new HashMap<>();

        String [] firstStrArr = s1.split("");
        String [] secondStrArr = s2.split("");

        List<String> firstStrList = new ArrayList<>(Arrays.asList(firstStrArr));
        List<String> secondStrList = new ArrayList<>(Arrays.asList(secondStrArr));

        firstStrList.forEach(character -> {
            firstStringMap.put(character,0);
        });

        secondStrList.forEach(character -> {
            secondStringMap.put(character,0);
        });

        Map<String, Integer> loopMap;

        if(firstStringMap.size() < secondStringMap.size())
            loopMap  = new HashMap<>(firstStringMap);
        else
            loopMap  = new HashMap<>(secondStringMap);


        if(firstStringMap.size() < secondStringMap.size())
           for(String key: loopMap.keySet()) {
                if(secondStringMap.containsKey(key))
                    return "YES";
            }
        else
            for(String key: loopMap.keySet()) {
                if(firstStringMap.containsKey(key))
                    return "YES";
            }

        return "NO";

    }
}
