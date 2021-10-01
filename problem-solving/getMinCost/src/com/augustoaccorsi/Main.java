package com.augustoaccorsi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] crew = {5,3,1,4,6};
        int[] job = {9,8,3,15,1};
        List<Integer> crew_id =Arrays.stream(crew).boxed().toList();
        List<Integer> job_id =Arrays.stream(job).boxed().toList();

        System.out.println(getMinCost(crew_id, job_id));
    }

    public static long getMinCost(List<Integer> crew_id, List<Integer> job_id) {
        List<Integer> crew = new ArrayList<>(crew_id);
        List<Integer> job = new ArrayList<>(job_id);
        Collections.sort(crew);
        Collections.sort(job);
        long count = 0;
        for(int i = 0; i < crew.size(); i++){
            count += Math.abs(crew.get(i) - job.get(i));
        }

        return count;
    }
}
