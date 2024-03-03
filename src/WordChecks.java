import java.util.Scanner;
import java.util.*;
public class WordChecks {

    public static boolean is_Abecedarian(String a) {
        int b = a.length() - 1;

        for (int i = 0; i < b; i++) {

            if (a.charAt(i) <= a.charAt(i + 1)) {
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean isPairIsogram(String word) {
        if(word == null);
        return false;

        word = word.toLowerCase();
        //
        char[] arr = word.toCharArray();
        for (char ch: arr) {

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a word: ");
        String a1 = in.nextLine();
        String a2 = in.nextLine();

        System.out.println("This a Abecedarian word? : " + is_Abecedarian(a1));
        System.out.println("Is this a Isogram word? : " + isPairIsogram(a2));
    }
}
