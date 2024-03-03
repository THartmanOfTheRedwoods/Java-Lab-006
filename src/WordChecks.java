/**
 * @author Alexei Iachkov
 * @author Trevor Hartman
 * @date 3-2-24
 * @version 1.0
 */
import java.util.Scanner;

public class WordChecks {
    public static boolean isAbecedarian(String word) {
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) > word.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPairIsogram(String word) {
        word = word.toLowerCase();
        for (char c = 'a'; c <= 'z'; c++) {
            int count = 0;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == c) {
                    count++;
                }
            }
            if (count != 2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to check for abecedarian order: ");
        String testWord1 = scanner.next();

        System.out.println(testWord1 + " is abecedarian: " + isAbecedarian(testWord1));

        System.out.print("Enter a word to check for pair isogram: ");
        String testWord2 = scanner.next();

        System.out.println(testWord2 + " is a pair isogram: " + isPairIsogram(testWord2));
    }
}