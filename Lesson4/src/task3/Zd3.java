package task3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *A program for checking whether any torn word in a string is a palindrome.
 */
public class Zd3 {
    public static void main(String[] args) {

        String str = new String("Ascdf jgdr kdhjg acca fhhf klsgh lffl");
        System.out.println(str);
        System.out.print("Enter number word: ");
        Scanner numWord = new Scanner(System.in);
        String numberWord = numWord.nextLine();
        String str3= new String();
        int i = Integer.parseInt(numberWord.trim());
        System.out.println(getNumberWord(i, str, str3));
        System.out.println(str3);
        String str1 = String.valueOf(i).toLowerCase();
        System.out.println(str1);
        System.out.println(polynominal(str3));
    }

        public static String getNumberWord(int i, String str, String str3) {
        String[] numberStr = str.split(" ");
        Arrays.sort(numberStr);
        return  str3 = (numberStr[i]);
    }

    public static String polynominal(String str3){
        StringBuilder str2 = new StringBuilder(str3).reverse();
        System.out.println(str2);
        boolean result = true;
        for (int cont = 0; cont < str2.length(); cont++) {
            if (str3.charAt(cont) != str2.charAt(cont)) {
                result = false;

            }
        }
        System.out.println(result);
        return str3;
    }
}
