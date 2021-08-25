package task2;

import java.util.Arrays;

/**
 *A string of arbitrary length with arbitrary words is given.
 * Find a word in which the number of different characters is minimal.
 */

public class Zd2 {
    private static int diffWords(String st){

        StringBuffer srt = new StringBuffer();
        String fd;

        for (int i=0;i<st.length();i++) {
            fd = String.valueOf(st.charAt(i));
            if (srt.indexOf(fd)==-1)
                srt.append(fd);
        }

        return srt.length();
    }

    public static void main(String[] args) {

        String[] str = { "sfkjvbbv", "mkkkkkk","sdfbsdfv","dfsvn"};
        String word = str[0];
        System.out.println("Words: ");

        for (int i=0;i<str.length;i++){
            System.out.print(str[i]+", ");
            if ( diffWords(str[i])<diffWords(word))
                word = str[i];
        }

        System.out.println("\nWhat are you looking for word: "+word+", Number of different symbol: "+diffWords(word));
    }
}