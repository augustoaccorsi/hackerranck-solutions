package com.augustoaccorsi;


import java.io.*;
import java.util.*;

class Player{
    String name;
    int score;

    public Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player>{
    @Override
    public int compare(Player p1, Player p2) {
        if(p1.score == p2.score)
            return p1.name.compareTo(p2.name);
        if(p1.score > p2.score)
            return  -1;
        return 1;

    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        List<Player> players = new ArrayList<>();
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            players.add(new Player(scan.next(), scan.nextInt()));
        }
        scan.close();

        Collections.sort(players,checker);

        for(Player player: players){
            System.out.println(player.name+" "+player.score);
        }
    }
}
