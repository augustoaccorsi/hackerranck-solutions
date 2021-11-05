package com.augustoaccorsi;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(random());
        System.out.println(random());
        System.out.println(random());
    }

    public static int random(){
        Random rand = new Random(System.currentTimeMillis());
        return rand.nextInt();
    }
}
