import java.util.Scanner;

public class WordChecks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        System.out.println("isAbecedarian '"+word+"': "+isAbecedarian(word));
        System.out.println("isPairIsogram '"+word+"': "+isPairIsogram(word));
    }

    public static boolean isAbecedarian(String s) {
        if (s == null || s.length() < 2) {
            return true;
        }
        String lowerCaseWord = s.toLowerCase();
        char[] chars = lowerCaseWord.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] < chars[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPairIsogram(String s) {
        if (s == null || s.length() < 2) {
            return false;
        }
        int[] charCounts = new int[26];
        for (char c : s.toLowerCase().toCharArray()) {
            charCounts[c - 'a']++;
        }
        for (int count : charCounts) {
            if (count != 2) {
                return false;
            }
        }
        return true;
    }
}