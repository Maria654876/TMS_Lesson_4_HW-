package task1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * A string of arbitrary length with arbitrary words is given.
 * Find the shortest word in the string and display it on the screen.
 * Find the longest word in the string and display it on the screen.
 * If there are several such words, then print the last of them.
 */

public class Zd1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();

        String longWord = "", shortWord = line;

        for (String s : line.split(" ")) {
            if (s.length() > longWord.length()) {
                longWord = s;
            }
            if (s.length() < shortWord.length()) {
                shortWord = s;
            }

        }
        System.out.println("The longest word: '" + longWord + "'");
        System.out.println("The shortest word: '" + shortWord + "'");
    }

}