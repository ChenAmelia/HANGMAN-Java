package org.example;

//A class responsible for interacting with the player e.g. capture input, print messages.

import java.util.Scanner;

public class Interaction {

    public boolean welcomeWords() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Hangman!");
        System.out.println("Please enter your name: ");
        String name = scanner.next();
        System.out.println("Hi " + name + "! Nice to see you! Please press s to start the game! Press q to quit the game.");
        String choice = scanner.next();

        if (choice.equals("s")) {
            System.out.println("Game start! Have fun!");
            System.out.println("please input the first letter");
        } else if (choice.equals("q")) {
            System.out.println("Exiting...");
        } else {
            System.out.println("Please input a valid letter.");
        }

        return true;

    }








}
