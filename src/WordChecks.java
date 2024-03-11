import java.util.Scanner;
public class WordChecks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input abecedarian word: ");
        String word = scanner.next();
        if(!word.matches("[a-zA-Z]+")) {
            System.out.println("word can only consist of letters!");
        }else {
            System.out.println("Is \"" + word + "\" abecedarian? " + isAbecedarian(word));
        }
        System.out.println( isPairIsogram("ploplo"));
    }
    public static boolean isAbecedarian(String word) {
        for(int i = 1; i  < word.length(); i++) {
            if(word.charAt(i) < word.charAt(i-1)) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPairIsogram(String word) {
        if(word.length() % 2 != 0) {
            return false;
        }
        word = word.toLowerCase();
        int n = word.length();
            for(int i=0; i<(n/2); i++) {
                int characterCount =  1;
            for(int j=n-1; j>i; j--) {
                if (word.charAt(j) == word.charAt(i)) {
                    characterCount++;
                }
                if (characterCount > 2) {
                    return false;
                }
            }
            if(characterCount < 2) {
                return false;
            }
        }
            return true;
    }
}
