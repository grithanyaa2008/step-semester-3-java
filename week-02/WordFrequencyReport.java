import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordFrequencyReport {

    public static void printFilteredWordFrequency(String feedback) {
        // Defined list of stop words
        Set<String> stopWords = new HashSet<>(Arrays.asList("the", "was", "and", "a", "is", "of", "in"));

        // Normalize text: convert to lowercase and strip punctuation
        String cleanedText = feedback.toLowerCase()
                                    .replace(".", "")
                                    .replace(",", "");

        // Split text into individual words using whitespace regex
        String[] words = cleanedText.split("\\s+");

        // Count frequency of non-stop words
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty() && !stopWords.contains(word)) {
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            }
        }

        // Sort entries by frequency count in descending order
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());
        entryList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        // Print output
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String sampleInput = "The mentor was great, the session was great and clear.";
        printFilteredWordFrequency(sampleInput);
    }
}