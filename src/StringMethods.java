/*
 * Create a program that will allow users to enter a word, and a character number index.
 *
 * Your program will print out the size of the word, as well as the
 * substring (starting from 0) to the index the user specified.
 *
 * If the user entered index is larger than the size of the word,
 * the program will print "Index is larger than length".
 */

import java.util.Scanner;

public class StringMethods {
    public static void main(String [] args){
        String aWord, anIndex, msg;
        int index, wordSz = 0;

        Scanner keyboard = new Scanner(System.in);

        // get a word from the user
        System.out.println("Enter a word:");
        aWord = keyboard.next();

        // get an index from the user
        System.out.println("Enter an index:");
        anIndex = keyboard.next();

        index = Integer.parseInt(anIndex);   // convert char into int value

        wordSz = aWord.length();             // get word length

        if (index < 0)                       // check for invalid index number
            System.out.println("Index is needs to be greater than 0.");
        else if (wordSz >= index) {
            /*
             * print out the size of the word and
             * substring (starting from 0) to the index the user specified.
            */
            System.out.println("\n\nLength of " + aWord + " is " + wordSz);
            System.out.println("The substring from 0 to " + anIndex + " is " + aWord.substring(0, index+1));
        }
        else {
           // error message
            System.out.println("\n\nIndex is larger than length.");
        }
    }
}
