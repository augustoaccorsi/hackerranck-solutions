package com.augustoaccorsi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    int[] array = {73,67,38,33};
        List<Integer> grades = Arrays.stream(array).boxed().toList();
        System.out.println(gradingStudents(grades));
    }

    public static int nextMultiple5(int value){
        int next5 = 0;
        do{
            value++;
            if(value % 5 == 0){
                next5 = value;
            }
        }while (next5 == 0);
        return next5;
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> newGrades = new ArrayList<>(grades);
        for(int i = 0; i < grades.size(); i++){
            if(grades.get(i) >= 38) {
                int next5 = nextMultiple5(grades.get(i));
                if ((next5 - grades.get(i)) < 3)
                    newGrades.set(i, next5);
            }
        }
        return newGrades;
    }
}
