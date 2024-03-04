import java.util.Scanner;

public class WordChecks {
    public static boolean isAbecedarian(String word) {
        word = word.toLowerCase(); //ignore case

        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) > word.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPairIsogram(String word) {
        word = word.toLowerCase(); //ignore case

        int[] letterCount = new int[26];

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            int index = letter - 'a';
            letterCount[index]++;
        }
        for (int i = 0; i < letterCount.length; i++) {
            if (letterCount[i] != 2 && letterCount[i] != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word to see if it is abecedarian or a pair isogram: ");
        String word = in.next();
        System.out.printf("Abecedarian? %s%nPair Isogram? %s", isAbecedarian(word), isPairIsogram(word));

    }
}
