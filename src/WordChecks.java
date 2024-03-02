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
        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                count[c - 'a']++;
            }
        }
        for (int i : count) {
            if (i != 0 && i != 2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to check if it's abecedarian: ");
        String userWord = scanner.nextLine();

        System.out.print("Enter a word to check if it's an isogram: ");
        String inputWord = scanner.nextLine();

        System.out.println(userWord + " is abecedarian? " + isAbecedarian(userWord));
        System.out.println(inputWord + " is isogram? " + isPairIsogram(inputWord));
    }


}