package com.augustoaccorsi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    System.out.println(backwards("GUTO"));
        System.out.println(palindrome("ARARAO"));

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(leftRotation(list, 4));

        list = new ArrayList<>(Arrays.asList(1,2,3,5,4,6,7,8));
        minimumBribes(list);

        list = new ArrayList<>(Arrays.asList(4,1,2,3));
        minimumBribes(list);

        int[] array = {9,8,7,6,5,4,3,2,1};
        sortArray(array);
        for(int i = 0; i <= array.length - 1; i ++){
            System.out.print(array[i]+" ");
        }
    }

    public static String backwards(String str){
        String[] strArray = str.split("");
        String result = "";
        for(int i = (strArray.length - 1); i >= 0; i--){
            result = result.concat(strArray[i]);
        }

        return result;
    }

    public static String palindrome(String str){
        String[] strArray = str.split("");

        for(int i = 0; i <= (strArray.length/2); i++){
            if(!strArray[i].equals(strArray[strArray.length-1-i]))
                return "NO";
        }
        return "YES";
    }

    public static List<Integer> leftRotation(List<Integer> list, int rotations){
        int index = 0;

        while(index < rotations){
            for(int i = (list.size() - 1); i >= 0; i--){
                Collections.swap(list, i, list.size()-1);
            }
            index++;
        }


        return list;
    }

    public static void minimumBribes(List<Integer> queue) {
        int count = 0;
        boolean tooChaotic = false;
        for(int i = 0; i < queue.size()-1; i++) {
            if (queue.get(i) - (i + 1) > 2) {
                tooChaotic = true;
                System.out.println("Too Chaotic");
                break;
            } else if (queue.get(i) - (i + 1) == 1)
                count++;
            else if (queue.get(i) - (i + 1) == 2)
                count += 2;
        }

        if(!tooChaotic)
            System.out.println(count);

    }

    public static void sortArray(int[] array){
        boolean sorted = false;
        while(!sorted){
            sorted = true;
            for(int i = 0; i < array.length - 1; i ++){
                if(array[i] > array[i+1]){
                    int aux = array[i];
                    array[i] = array[i+1];
                    array[i+1]  = aux;
                    sorted = false;
                }
            }
        }
    }

    }
