package com.augustoaccorsi;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> birds = new ArrayList<>(Arrays.asList(1,1,2,2,3));
        System.out.println(migratoryBirds(birds));
    }

    public static int migratoryBirds(List<Integer> birds) {
        List<Integer> maxList = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(Integer bird: birds){
            if(!map.containsKey(bird)){
                map.put(bird, Collections.frequency(birds, bird));
            }
        }
        int max = Collections.max(map.values());

        Set<Integer> ids = map.keySet();

        map.

        System.out.println(map);

        return 1;

    }
}
