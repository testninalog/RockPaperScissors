package com.endava.day9;

public class RockPaperScissors {
//public static String rps (String p1, String p2)
    public static String rps (RPS p1, RPS p2){
        if(p1.equals(p2)){
            return "Draw!";
        }
//        else if(p1.equals("rock") && p2.equals("scissors")){
//            return  "Player 1 won!";
//        }
//        else if (p1.equals("scissors") && p2.equals("paper")){
//            return  "Player 1 won!";
//        }
//        else if (p1.equals("paper") && p2.equals("rock")){
//            return  "Player 1 won!";
//        }
//        else
//            return  "Player 2 won!";
        else if(p1==RPS.ROCK && p2==RPS.SCISSORS){
            return  "Player 1 won!";
        }
        else if (p1==RPS.SCISSORS && p2==RPS.PAPER){
            return  "Player 1 won!";
        }
        else if (p1==RPS.PAPER && p2==RPS.ROCK){
            return  "Player 1 won!";
        }
        else
            return  "Player 2 won!";
    }
}
