public class PalindromeChecker {

    // Approach 1: Iterative
    public static boolean isPalindromeIterative(String text) {
        int left = 0;
        int right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Approach 2: Recursive
    public static boolean isPalindromeRecursive(String text) {
        if (text.length() <= 1) {
            return true;
        }
        if (text.charAt(0) != text.charAt(text.length() - 1)) {
            return false;
        }
        return isPalindromeRecursive(text.substring(1, text.length() - 1));
    }

    // Approach 3: Array Reversal
    public static boolean isPalindromeArrayReversal(String text) {
        char[] original = text.toCharArray();
        char[] reversed = new char[original.length];
        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }
        return new String(original).equals(new String(reversed));
    }

    // Helper method to display output matching the assignment requirements
    public static void printResult(String text) {
        String iter = isPalindromeIterative(text) ? "Palindrome" : "Not Palindrome";
        String recur = isPalindromeRecursive(text) ? "Palindrome" : "Not Palindrome";
        String arr = isPalindromeArrayReversal(text) ? "Palindrome" : "Not Palindrome";

        System.out.println("Input: \"" + text + "\"");
        System.out.println("Output: Iterative: " + iter + " | Recursive: " + recur + " | Array Reversal: " + arr);
        System.out.println();
    }

    public static void main(String[] args) {
        printResult("madam");
        printResult("hello");
    }
}
    

