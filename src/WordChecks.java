import java.util.HashMap;
import java.util.Map;
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
        // Convert the word to lowercase to ignore case
        word = word.toLowerCase();

        // Create a map to store the count of occurrences of each letter
        Map<Character, Integer> occurrences = new HashMap<>();

        // Count occurrences of each letter in the word
        for (char ch : word.toCharArray()) {
            if (Character.isLetter(ch)) {
                occurrences.put(ch, occurrences.getOrDefault(ch, 0) + 1);
            }
        }

        // Check if every letter occurs exactly twice
        for (int count : occurrences.values()) {
            if (count != 2 && count != 4 && count != 6) {
                return false; // If any count is not 2, it's not a pair isogram
            }
        }

        return true; // If all counts are 2, it's a pair isogram
    }

    public static void main(String[] args) {

        System.out.println( isAbecedarian("abc"));
        System.out.println(isAbecedarian("zoo"));
        System.out.println(isPairIsogram("Tattletale"));

    }


}
