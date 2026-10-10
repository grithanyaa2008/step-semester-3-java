import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    public static char findFirstNonRepeatingChar(String text) {
        Map<Character, Integer> charCounts = new LinkedHashMap<>();

        for (char c : text.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        for (char c : text.toCharArray()) {
            if (charCounts.get(c) == 1) {
                return c;
            }
        }

        return '\0'; // Return null character if no non-repeating character exists
    }

    public static void main(String[] args) {
        String[] testInputs = {"swiss", "aabbcc"};

        for (String input : testInputs) {
            char result = findFirstNonRepeatingChar(input);
            if (result != '\0') {
                System.out.println("Input: \"" + input + "\" -> First Non-Repeating Character: '" + result + "'");
            } else {
                System.out.println("Input: \"" + input + "\" -> No Non-Repeating Character Found");
            }
        }
    }
}
