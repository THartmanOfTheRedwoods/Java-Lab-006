import java.util.Scanner;
/**
 *
 * @author Trevor Hartman
 * @author Eliot Rodriguez
 *
 * @since version 1.0
 * February 27, 2024
 *
 */
public class WordChecks {
    public static boolean isAbecedarian (String a) {
        int lastIndex = a.length() - 1;
        for (int i = 0; lastIndex > i; i++) {
            if (a.charAt(i) > a.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPairIsogram(String b) {
        b = b.toLowerCase();
        for (char c = 'a'; c <= 'z'; c++) {
            for (int i = 0; i < b.length(); i++) {
                int counter = 0;
                if (b.charAt(i) == c) {
                    counter++;
                }
                if (counter == 2) {
                    return false;
                }
            }
        }
        return true;
    }
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter any word to see if its an abecedarian: ");
        String inPut = scanner.nextLine();
        System.out.println("Your word is " + isAbecedarian(inPut));
        System.out.println("Enter any word to see if its a pair isogram: ");
        String inPut2 = scanner.nextLine();
        System.out.println("Your word is " + isPairIsogram(inPut2));

    }


}
