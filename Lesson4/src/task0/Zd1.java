package task0;

import java.util.Locale;
import java.util.Scanner;

/**
 * The document number has the format xxxx-yyy-xxxx-yyy-xyxy, where x is a number and y is a letter.
 * Display the first two blocks of 4 digits on the screen in one line
 * Display the document number, but replace blocks of three letters with (each letter will be replaced with )
 * Display only one letter from the document number in the format yyy/yyy/y/y in lowercase
 * Display the letters from the document number in the format" Letters:yyy/yyy/y/y " in uppercase (implement using the StringBuilder class)
 * Check whether the document number contains the sequence abc and whether the message contains the message or not (moreover, abc and ABC are considered to be the same sequence).
 * Check whether the document number begins with the sequence 555.
 * Check whether the document number ends with the sequence 1a2b.
 */
public class Zd1 {
    public static void main(String[] args) {
        String documentNumber="3243-abc-2384-dhf-2h4h";
        System.out.println("Number document"+documentNumber);
        System.out.println(documentNumber.substring(0,4)+"-"+documentNumber.substring(9,13));
        System.out.println(documentNumber.replace("abc","каждая буква заменятся на")+" "+documentNumber.replace("dhf", "каждая буква заменятся на"));
        System.out.println(documentNumber.toLowerCase().substring(5,8)+"/"+documentNumber.toLowerCase().substring(14,17)+"/"+documentNumber.toLowerCase().charAt(19)+"/"+documentNumber.toLowerCase().charAt(21));
        StringBuffer let=new StringBuffer();
        let.append("Letters:");
        System.out.println("\""+let+documentNumber.toUpperCase().substring(5,8)+"/"+documentNumber.toUpperCase().substring(14,17)+"/"+documentNumber.toUpperCase().charAt(19)+"/"+documentNumber.toUpperCase().charAt(21)+"\"");

        if (documentNumber.toUpperCase().contains("abc".toUpperCase())){
            System.out.println("Number document have abc");
        } else {
            System.out.println("Number document haven't abc");
        }

        if (documentNumber.toLowerCase().startsWith("555")){
            System.out.println("Number document have 555");
        } else {
            System.out.println("Number document haven't 555");
        }

        if (documentNumber.toLowerCase().endsWith("1a2b")){
            System.out.println("Number document have 1a2b");
        } else {
            System.out.println("Number document haven't 1a2b");
        }
    }
}
