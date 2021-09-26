package com.augustoaccorsi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    List<Integer> transaction1 = new ArrayList<>();
        List<Integer> transaction2 = new ArrayList<>();
        List<Integer> transaction3 = new ArrayList<>();
        List<List<Integer>> transactions = new ArrayList<>();
        Integer threshold = 2;

        transaction1.add(1); transaction1.add(2); transaction1.add(10);
        transaction2.add(1); transaction2.add(8); transaction2.add(15);
        transaction3.add(2); transaction3.add(1); transaction3.add(10);

        transactions.add(transaction1); transactions.add(transaction2); transactions.add(transaction3);

        System.out.println(getUserThresholds(transactions, threshold));
    }

    public static List<Integer> getUserThresholds(List<List<Integer>> transactions, Integer threshold){
        List<Integer> aux = new ArrayList<>();
        List<Integer> users = new ArrayList<>();

        for(List<Integer> transaction: transactions){
            aux.add(transaction.get(0));
            aux.add(transaction.get(1));
        }

        for(Integer user: aux){
            if(Collections.frequency(aux, user) > threshold){
                if(!users.contains(user)){
                    users.add(user);
                }
            }
        }

        return users;
    }
}
