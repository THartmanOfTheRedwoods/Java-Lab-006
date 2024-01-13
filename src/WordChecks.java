import java.util.Scanner;

public class WordChecks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.nextLine().toLowerCase();

        // Check if Abecedarian and or PairIsogram
        boolean isAbecedarian = isAbecedarian(word);
        boolean isPairIsogram = isPairIsogram(word);

        System.out.println(word + (isAbecedarian ? " is Abecedarian." : " is not Abecedarian."));
        System.out.println(word + (isPairIsogram ? " is PairIsogram." : " is not PairIsogram."));
        input.close();
    }


    public static boolean isAbecedarian(String word) {
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) > word.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPairIsogram(String word){
        int[] charCounts = new int[26]; // English alphabet

        // Count occurrences of each character
        for (char x : word.toCharArray()) {
            if (Character.isLetter(x)) {
                int index = x - 'a'; // Convert character to index (a = 0, b = 1, ...)
                charCounts[index]++;
            }
        }

        // Check if all letters appear exactly twice
        for (int count : charCounts) {
            if (count % 2 != 0){
                return false;
            }
            else if (count != 2) {
                return true;
            }
        }

        return false;
    }
    }








