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

        int[] charCount = new int[26];

        for (char ch : word.toCharArray()) {
            if (Character.isLetter(ch)) {
                int index = ch - 'a';
                charCount[index]++;
            }
        }
        for (int count : charCount) {
            if (count != 0 && count != 2) {
                return false;
            }
        }
        return true;
    }
}

