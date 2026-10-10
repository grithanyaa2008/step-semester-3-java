public class WordReversalEncoder {

    public static String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder(words[i]);
            result.append(sb.reverse());
            
            // Add a space between words, but not after the last word
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Test case from the assignment
        String input = "hello club";
        String output = reverseEachWord(input);
        
        System.out.println(output); // Expected: olleh bulc
    }
}