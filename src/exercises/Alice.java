package exercises;

import org.launchcode.java.demos.lsn1datatypes.Message;

import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {
        String givenVerse = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?";
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Please enter a word from the first sentence of Alice's Adventures in Wonderland");
        String word = input.next();
        if (givenVerse.contains(word.toLowerCase())) {

            System.out.println("test " + "true");
        }

        else {
            System.out.println("test " + "false");
        }
    }
}
