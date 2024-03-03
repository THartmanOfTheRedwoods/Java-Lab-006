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

        for (int cnt : count) {
            if (cnt != 2) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String word1 = "abcde";
        String word2 = "hello";
        System.out.println(word1 + " is abecedarian: " + isAbecedarian(word1));
        System.out.println(word2 + " is abecedarian: " + isAbecedarian(word2));

        String word3 = "apple";
        String word4 = "banana";
        String word5 = "BooKkeePer";

        System.out.println(word3 + " is a pair isogram: " + isPairIsogram(word3));
        System.out.println(word4 + " is a pair isogram: " + isPairIsogram(word4));
        System.out.println(word5 + " is a pair isogram: " + isPairIsogram(word5));
    }
}
