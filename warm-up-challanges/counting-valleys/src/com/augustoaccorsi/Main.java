package com.augustoaccorsi;

public class Main {

    public static void main(String[] args) {
        System.out.println(countingValleys(12, "DDUUDDUDUUUD"));
    }

    public static int countingValleys(int steps, String path) {

        int seaLevel = 0, valley = 0;
        boolean flag = false;

        for(char c: path.toCharArray()){
            if(c == 'U'){
                seaLevel++;
            }
            else{
                seaLevel--;
            }

            if(seaLevel < 0){
                flag = true;
            }

            if(flag && seaLevel >= 0){
                valley++;
                flag = false;
            }

        }
        return valley;
    }
}
