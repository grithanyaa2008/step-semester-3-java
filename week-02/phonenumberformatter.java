public class phonenumberformatter {

    public static String maskPhoneNumber(String phone) {
        // Check for null, correct length (10 digits), and all numeric characters
        if (phone == null || phone.length() != 10 || !phone.matches("\\d+")) {
            return "Invalid phone number";
        }

        // Extract the last 4 digits using substring()
        String last4Digits = phone.substring(6);

        // Build masked string using StringBuilder
        StringBuilder sb = new StringBuilder("XXXXXX");
        
        // Insert '-' between the mask and the last 4 digits
        sb.append("-").append(last4Digits);

        return sb.toString();
    }

    public static void main(String[] args) {
        // Sample Tests
        System.out.println(maskPhoneNumber("9876543210")); // Output: XXXXXX-3210
        System.out.println(maskPhoneNumber("98765"));      // Output: Invalid phone number
    }
}
