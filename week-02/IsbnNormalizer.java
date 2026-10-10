public class IsbnNormalizer {

    public static String normalizeCode(String raw) {
        String trimmed = raw.trim();
        if (trimmed.length() < 3) {
            return trimmed;
        }
        return trimmed.substring(0, 3).toUpperCase() + trimmed.substring(3);
    }

    public static String validateAndFormat(String code) {
        // Check 1: Length
        if (code.length() != 13) {
            return "Invalid: wrong length";
        }

        // Check 2: First 3 characters must be letters
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid: publisher code must be 3 letters";
            }
        }

        // Check 3: Remaining 10 characters must be digits
        for (int i = 3; i < 13; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid: non-digit body";
            }
        }

        // Format valid output using StringBuilder
        String pubCode = code.substring(0, 3);
        String year = code.substring(3, 7);
        String catalog = code.substring(7);

        StringBuilder sb = new StringBuilder();
        sb.append("[").append(pubCode).append("] ")
          .append("YEAR: ").append(year).append(" | ")
          .append("CATALOG: ").append(catalog);

        return sb.toString();
    }

    public static void main(String[] args) {
        // Test Case 1: Valid input
        String input1 = " pen2026004251 ";
        String normalized1 = normalizeCode(input1);
        System.out.println(validateAndFormat(normalized1));

        // Test Case 2: Invalid publisher code
        String input2 = "12N2026004251";
        String normalized2 = normalizeCode(input2);
        System.out.println(validateAndFormat(normalized2));
    }
}