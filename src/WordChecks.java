public class WordChecks {
    public static boolean isAbecedarian(String word) {
        word = word.toLowerCase();

        // loop through each char, comparing the current char with the next one
        for (int i = 0; i < word.length() - 1; i++) {
            // if any pair is out of order, return false
            if (word.charAt(i) > word.charAt(i + 1)) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPairIsogram(String word) {
        word = word.toLowerCase();

        // hashmap to keep track of the count of each char
        java.util.Map<Character, Integer> charCount = new java.util.HashMap<>();

        // loop through each character in the word
        for (char c : word.toCharArray()) {
            // update the count in the map
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // check if all chars occur exactly twice
        for (int count : charCount.values()) {
            if (count != 2) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String abecaHot = "Knotty";
        String abecaNot = "Knots";
        String isoTope = "Noon";
        String isoNope = "Dawn";

        System.out.println(abecaHot + " is abecedarian: " + isAbecedarian(abecaHot));
        System.out.println(abecaNot + " is abecedarian: " + isAbecedarian(abecaNot));

        System.out.println(isoTope + " is an isogram: " + isPairIsogram(isoTope));
        System.out.println(isoNope + " is an isogram: " + isPairIsogram(isoNope));
    }
}