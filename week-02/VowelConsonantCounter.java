public class VowelConsonantCounter {

    public static void countVowelsAndConsonants(String text) {
        int vowels = 0;
        int consonants = 0;

        // Convert the string to lowercase to make checks case-insensitive
        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Ignore spaces
            if (ch == ' ') {
                continue;
            }

            // Check if character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                // Any other letter is a consonant
                consonants++;
            }
        }

        System.out.println("Vowels: " + vowels + " | Consonants: " + consonants);
    }

    public static void main(String[] args) {
        // Sample input from the assignment
        countVowelsAndConsonants("Java Programming");
    }
}