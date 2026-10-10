public class pinvalidator {

    public static void checkPinLength(String pin) {
        if (pin.length() != 4) {
            System.out.println("Invalid PIN — must be exactly 4 digits.");
        } else {
            System.out.println("PIN length OK.");
        }
    }

    public static void main(String[] args) {
        // Test cases from the assignment
        checkPinLength("482");   // Expected: Invalid PIN — must be exactly 4 digits.
        checkPinLength("4820");  // Expected: PIN length OK.
    }
}