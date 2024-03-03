import java.util.Scanner;
import java.util.HashMap;

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
        word = word.toLowerCase(); //Duplicated, but "Poop" failed the test.
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : word.toCharArray()) {
            int count = charCount.getOrDefault(c, 0);
            if (count == 2) {
                return false; /* If a character appears more than twice, it's not a pair isogram...
                *or does it simply need to be an even number of instances?
                */
            }
            charCount.put(c, count + 1);
        }

        // Checking to see if all characters have a matching count of 2
        for (int count : charCount.values()) {
            if (count != 2) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        if (isAbecedarian(word)) {
            System.out.println(word + " is an abecedarian word.");
        } else {
            System.out.println(word + " is not an abecedarian word.");
        }

        if (isPairIsogram(word)) {
            System.out.println(word + " is a pair isogram.");
        } else {
            System.out.println(word + " is not a pair isogram.");
        }
    }
}
