package com.augustoaccorsi;

public class Main {

    public static void main(String[] args) {
	    staircase(6);
    }

    public static void staircase(int n) {
        String space = " ", value = "#", step = "";
        for(int i = 1; i <= n; i++){
            step = step.concat(space.repeat(n-i));
            step = step.concat(value.repeat(i));
            System.out.println(step);
            step = "";
        }
    }
}
