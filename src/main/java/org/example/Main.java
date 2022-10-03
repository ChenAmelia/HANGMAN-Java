package org.example;


import java.util.Random;
import java.util.Scanner;


public class Main {

    public static Random random = new Random();

    static public void Guess(String guessWord) {

        Scanner scanner = new Scanner(System.in);

        char[] underscoreArr = new char[guessWord.length()];

        for (int i = 0; i < guessWord.length(); i++) {
            underscoreArr[i] = '_';
        }

        //char input = scanner.next().toLowerCase().charAt(0);
        //char inputSecond = scanner.next().charAt(1);

      int life = 8;


        while(life > 0) {
            char input = scanner.next().toLowerCase().charAt(0);
            if (guessWord.contains(String.valueOf(input))) {
                for (int i = 0; i < guessWord.length(); i++) {
                    if (input == guessWord.charAt(i)) {
                        underscoreArr[i] = input;
                    }
                }
            } else {
                life--;
            }
            System.out.println(underscoreArr);
            System.out.println(life + " life remaining.");

            if(life == 0) {
                System.out.println("Game Over.");
            }
        }


//        while(life > 0) {
//            char input = scanner.next().toLowerCase().charAt(0);
//            for(int i = 0; i < guessWord.length(); i++) {
//                if(input == guessWord.charAt(i)) {
//                    underscoreArr[i] = input;
//                } else {
//                    life --;
//                }
//            }
//            System.out.println(underscoreArr);
//            System.out.println(life + " life remaining.");
//        }

    }


    public static void main(String[] args) {

        Interaction interaction = new Interaction();
        System.out.println(interaction.welcomeWords());

        String guessWord = "elephant";

        Guess(guessWord);

    }
}