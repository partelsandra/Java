package week7;

import java.util.Scanner;
import java.util.ArrayList;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        System.out.println("Statements:\n  add - adds a word pair to the dictionary\n  translate - asks a word and prints its translation\n  quit - quits the text user interface");

        while (true) {
            System.out.print("Statement: ");
            String input = this.reader.nextLine();

            if (input.equals("add")) {
                System.out.print("In Finnish: ");
                String word = this.reader.nextLine();
                System.out.print("Translation: ");
                String translation = this.reader.nextLine();
                this.dictionary.add(word, translation);
            } else if (input.equals("translate")) {
                System.out.print("Give a word: ");
                String word = this.reader.nextLine();
                String translation = this.dictionary.translate(word);
                System.out.println("Translation: " + (translation != null ? translation : "Unknown word"));
            } else if (input.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else {
                System.out.println("Unknown statement");
            }
        }
    }
}

