package com.augustoaccorsi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> queue = new ArrayList<>();
        queue.add(2);
        queue.add(1);
        queue.add(5);
        queue.add(3);
        queue.add(4);

        minimumBribes(queue);
    }

    public static void minimumBribes(List<Integer> queue) {
        int count = 0;
        int midOfThree = Integer.MAX_VALUE;
        int maxOfThree = Integer.MAX_VALUE;
        int minOfThree = Integer.MAX_VALUE ;

        for (int i = queue.size(); i-- > 0; ) {
            if((queue.get(i)-i) > 3 ) {
                System.out.println("Too chaotic");
                return;
            }
            else{
                if(queue.get(i) > maxOfThree){
                    System.out.println("Too chaotic");
                    return;
                }
                else if(queue.get(i) > midOfThree){
                    count += 2;
                }
                else if(queue.get(i) > minOfThree){
                    count++;
                }

                if(queue.get(i)<minOfThree){
                    maxOfThree=midOfThree;
                    midOfThree=minOfThree;
                    minOfThree = queue.get(i);
                }
                else if(queue.get(i)<midOfThree){
                    maxOfThree=midOfThree;
                    midOfThree = queue.get(i);
                }
                else if(queue.get(i)<maxOfThree){
                    maxOfThree = queue.get(i);
                }
            }
        }
        System.out.println(count);
    }
}

