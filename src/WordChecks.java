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

        System.out.println("The word " + word2 + " is an Isogram word.");

        int[] letterCount = new int[26];
        String lower = word2.toLowerCase();
        for(int i = 0; i < word2.length(); i++) {
            char letter = word2.charAt(i);
            if(letter >= 'a' && letter <= 'z'){
                letterCount[letter - 'a']++;
            }
        }
        for(int count : letterCount) {
            if (count % 2 != 0){
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
