package com.augustoaccorsi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> socks = new ArrayList<>();
        socks.add(1); //1 1 3 1 2 1 3 3 3 3
        socks.add(1);
        socks.add(3);
        socks.add(1);
        socks.add(2);
        socks.add(1);
        socks.add(3);
        socks.add(3);
        socks.add(3);
        socks.add(3);
        int number = 10;

        System.out.println(socksCounter(socks, number));
    }

    public static int socksCounter(List<Integer> socks, int number){
        List<Integer> pairs = new ArrayList<>();
        int count = 0;
        for(int value: socks){
            if(!pairs.stream().anyMatch(c -> c.equals(value))){
                pairs.add(value);
            }
            else {
                if (Collections.frequency(pairs, value) < 2){
                    pairs.add(value);
                }
            }
            if(Collections.frequency(pairs, value) == 2){
                int aux = 0;
                List<Integer> auxList = new ArrayList<>(pairs);
                for(int i = 0; i < auxList.size(); i++){
                    if(auxList.get(i) == value){
                        pairs.remove((Integer)value);
                        aux++;
                    }
                }
                if(aux == 2) {
                    count++;
                }
            }
        }
        System.out.println(pairs);
        return count;
    }
}
