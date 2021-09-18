package com.augustoaccorsi;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> clouds = new ArrayList<>();
        clouds.add(0);
        clouds.add(0);
        clouds.add(1);
        clouds.add(0);
        clouds.add(0);
        clouds.add(1);
        clouds.add(0);
        System.out.println(jumpingOnClouds(clouds));
    }

    public static int jumpingOnClouds(List<Integer> clouds) {
        int jumps = 0, index =0;
        boolean flag = false;
        do{
            try {
                if (clouds.get(index) == 0) {
                    if (clouds.get(index + 2) == 0) {
                        index += 2;
                        jumps++;
                    } else if (clouds.get(index + 1) == 0) {
                        index += 1;
                        jumps++;
                    }
                }
            }
            catch (Exception e){
                try {
                    if (clouds.get(index + 1) == 0) {
                        index += 1;
                        jumps++;
                    }
                }
                catch (Exception ex){ flag = true;}
            }

            if(index >= clouds.size()){
                flag = true;
            }
        }
        while (!flag);

        return jumps;
    }
}
