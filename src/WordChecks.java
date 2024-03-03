import java.util.Scanner;
import java.util.Map;
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
        word = word.toLowerCase();
        Map<Character, Integer> letterCount = new HashMap<>();

        for (char letter : word.toCharArray()) {
            letterCount.put(letter, letterCount.getOrDefault(letter, 0) + 1);
        }
        for (int count : letterCount.values()) {
            if (count != 2) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Check a word to see if it is abecedarian: ");
        String enterWordAbecedarian = scanner.nextLine();
        System.out.println("Is '" + enterWordAbecedarian + "' abecedarian? " + isAbecedarian(enterWordAbecedarian));

        System.out.println("Check a word to see if it is a Pair Isogram: ");
        String enterWordIsogram = scanner.nextLine();
        System.out.println("Is '" + enterWordIsogram + "' a Pair Isogram? " + isPairIsogram(enterWordIsogram));

                scanner.close();
    }
}
