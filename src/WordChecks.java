public class WordChecks {

    public static boolean isAbecedarian(String word){

        System.out.println("The word " + word + " is abecedarian. ");

        for(int i = 1; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            char previousChar = word.charAt(i - 1);

            if (currentChar < previousChar) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPairIsogram(String word2) {

        System.out.println("The word " + word2 + " is a Pair Isogram.");

        int[] counts = new int[26];
        String lower = word2.toLowerCase();
        for (char letter : lower.toCharArray()) {
            int index = letter - 'a';
            counts[index]++;
        }
        for (int count : counts) {

            if (count != 0 && count != 2){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isAbecedarian("apple"));


        System.out.println(isPairIsogram("mama"));
    }
}
