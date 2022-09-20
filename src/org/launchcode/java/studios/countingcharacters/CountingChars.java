package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;


public class CountingChars {

    public static void main (String[] args) throws IOException {

        //String givPhrase = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        Path filePath = Path.of("c:/Nisha/Launchcode/unit2java/demo.txt");

        String phrase = Files.readString(filePath);

        //String phrase;
        //Scanner input = new Scanner(System.in);
        //System.out.println("Please enter a phrase to count the character in it:");
        //phrase = input.nextLine();

        String givPhrase = removeNonAlphanumeric(phrase);

        char[] charactersInString = givPhrase.toLowerCase().toCharArray();
        HashMap<Character, Integer> countChars = new HashMap<>();

        for (int i=0; i<charactersInString.length; i++){

            int count = 0;

            for (int j=0; j<charactersInString.length; j++){

                if (charactersInString[i]==charactersInString[j]){
                    count++;
                }
            }
            countChars.put(charactersInString[i],count);
            //System.out.println("Count" + charactersInString[i] + count);
        }

        for (Map.Entry<Character, Integer> eachChar : countChars.entrySet()) {
            System.out.println(eachChar.getKey() + ": " + eachChar.getValue());
        }


    }

    public static String removeNonAlphanumeric(String str)
    {
        // replace the given string
        // with empty string
        // except the pattern "[^a-zA-Z0-9]"
        str = str.replaceAll("[^a-zA-Z0-9]", "");

        // return string
        return str;
    }
}
