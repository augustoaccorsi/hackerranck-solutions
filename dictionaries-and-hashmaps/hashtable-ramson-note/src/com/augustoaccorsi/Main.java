package com.augustoaccorsi;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> magazine = new ArrayList<>(Arrays.asList("give","me", "one", "grand", "today", "night"));
        List<String> note = new ArrayList<>(Arrays.asList("give", "one", "grand", "today"));
        checkMagazine(magazine, note);
    }

    public static void checkMagazine(List<String> magazine, List<String> note) {
        Map<String, Integer> magazineMap = new HashMap<>();
        Map<String, Integer> ransomMap = new HashMap<>();

        magazine.forEach(word -> {
            if(!magazineMap.containsKey(word))
                magazineMap.put(word, 0);
            else
                magazineMap.put(word, magazineMap.get(word) + 1);
        });

        note.forEach(word -> {
            if(!ransomMap.containsKey(word))
                ransomMap.put(word, 0);
            else
                ransomMap.put(word, ransomMap.get(word) + 1);
        });

        boolean yes = true;

        for(String key: ransomMap.keySet()){
            if (!magazineMap.containsKey(key)) {
                System.out.println("No");
                yes = false;
                break;
            }
            int needed = ransomMap.get(key);
            if (magazineMap.get(key) < needed) {
                System.out.println("No");
                yes = false;
                break;
            }
        }

        if(yes)
            System.out.println("Yes");

    }
}
