package org.example;

import java.util.ArrayList;
import java.util.Random;

//A class responsible for storing your words with a method to randomly select a word.

public class Words {

    public static Random random = new Random();
    public static ArrayList<String> words = new ArrayList<String>();

    static {
        words.add("Griddle");
        words.add("Skimmer");
        words.add("Knife");
        words.add("Fork");
        words.add("Spoon");
        words.add("Bowl");
        words.add("Trivet");

    }

    public static String getRandomWord() {
        return words.get((int) (Math.random() * (words.size())));
    }

}
