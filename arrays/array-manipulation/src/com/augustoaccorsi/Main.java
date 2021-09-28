package com.augustoaccorsi;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1); a.add(5); a.add(3);
        List<Integer> b = new ArrayList<>();
        b.add(4); b.add(8); b.add(7);
        List<Integer> k = new ArrayList<>();
        k.add(6); k.add(9); k.add(1);
        List<List<Integer>> queries = new ArrayList<>();
        queries.add(a); queries.add(b); queries.add(k);

        System.out.println(arrayManipulation(10, queries));
    }

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        List<Integer> list = IntStream.of(new int[n]).boxed().collect(Collectors.toList());

        Map<Integer, List<Integer>> map = new HashMap<>();

        Map<Integer,List<Integer>> bigMap = list.stream().collect(Collectors.toMap(Function.identity(),e-> new ArrayList<Integer>()));

        map.put(1, queries.get(0));

        System.out.println(bigMap);



        for(List<Integer> query: queries){
            for(int i = query.get(0)-1; i < query.get(1); i++){
                list.set(i, (Integer)(list.get(i)+query.get(2)));
            }
        }

        return Collections.max(list);
    }
}
