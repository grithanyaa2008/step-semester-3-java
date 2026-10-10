public class BankTransactionReference {

    // Normalizes the string by trimming and converting the first 3 characters to uppercase
    public static String normalizeReference(String raw) {
        if (raw == null) {
            return "";
        }
        String trimmed = raw.trim();
        if (trimmed.length() < 3) {
            return trimmed.toUpperCase();
        }
        return trimmed.substring(0, 3).toUpperCase() + trimmed.substring(3);
    }

    // Validates the normalized string and builds the formatted output
    public static String validateAndFormat(String reference) {
        if (reference == null || reference.length() != 14) {
            return "Invalid: wrong length";
        }

        // Validate the first 3 characters (bank code) are letters
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(reference.charAt(i))) {
                return "Invalid: bank code must be 3 letters";
            }
        }

        // Validate the remaining 11 characters are digits
        for (int i = 3; i < 14; i++) {
            if (!Character.isDigit(reference.charAt(i))) {
                return "Invalid: non-digit body";
            }
        }

        // Extract components for formatting
        String bankCode = reference.substring(0, 3);
        String day = reference.substring(3, 5);
        String month = reference.substring(5, 7);
        String year = reference.substring(7, 9);
        String seq = reference.substring(9, 14);

        // Build output string using StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(bankCode).append("] ")
          .append("DATE: ").append(day).append("/").append(month).append("/").append(year)
          .append(" | SEQ: ").append(seq);

        return sb.toString();
    }

    public static void main(String[] args) {
        // Sample Test 1
        String normalized1 = normalizeReference("  hdf03022600042  ");
        System.out.println(validateAndFormat(normalized1)); 
        // Output: [HDF] DATE: 03/02/26 | SEQ: 00042

        // Sample Test 2
        String normalized2 = normalizeReference("12F03022600042");
        System.out.println(validateAndFormat(normalized2)); 
        // Output: Invalid: bank code must be 3 letters
    }
}