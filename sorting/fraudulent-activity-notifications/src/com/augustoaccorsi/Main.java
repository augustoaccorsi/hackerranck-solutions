package com.augustoaccorsi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    List<Integer> expenditure = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        System.out.println(activityNotifications(expenditure, 3));
    }

    public static double getMedian(List<Integer> subList){
        int size = subList.size();
        Collections.sort(subList);

        if(size%2 != 0)
            return subList.get(((size+1)/2)-1);
        return (double)(subList.get(size/2-1)+subList.get(size/2))/2;
    }

    public static int activityNotifications(List<Integer> expenditure, int d) {
            int notifications = 0;
            // d = 3
            for(int i = d; i < expenditure.size(); i ++){
                if(expenditure.get(d) >= (2 * getMedian(expenditure.subList(i-d,i))))
                    notifications++;
            }
             return notifications;
    }
}
