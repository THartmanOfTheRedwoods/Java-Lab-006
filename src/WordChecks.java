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
        int[] count = new int[26];
        for (char ch : word.toCharArray()) {
            if (Character.isLetter(ch)) {
                count[ch - 'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0 && count[i] != 2) {
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
            System.out.println("The word '" + word + "' is abecedarian.");
        } else {
            System.out.println("The word '" + word + "' is not abecedarian.");
        }

        if (isPairIsogram(word)) {
            System.out.println("The word '" + word + "' is a pair isogram.");
        } else {
            System.out.println("The word '" + word + "' is not a pair isogram.");
        }

    }
}