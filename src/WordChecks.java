import java.util.Scanner;

public class WordChecks {
    public static boolean isAbecedarian(String word) {
        word = word.toLowerCase();
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
            int counter = 0;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == c) {
                    counter++;
                }
            }
            if (counter == 2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter any word to see if it's an abecedarian: ");
        String word1 = scanner.nextLine();
        System.out.println("The word you entered is " + isAbecedarian(word1));

        System.out.println("Please enter any word to see if it's a pair isogram: ");
        String word2 = scanner.nextLine();
        System.out.println("The word you entered is " + isPairIsogram(word2));
    }
}


