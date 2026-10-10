public class LibraryMember {
    // 1. private: only accessible within this class
    private String membershipPin;
    
    // 2. default (no modifier): accessible within the same package
    String branchCode;
    
    // 3. protected: accessible within same package AND subclasses in different packages
    protected double finesOwed;
    
    // 4. public: accessible from anywhere
    public String displayName;

    public LibraryMember(String membershipPin, String branchCode, double finesOwed, String displayName) {
        this.membershipPin = membershipPin;
        this.branchCode = branchCode;
        this.finesOwed = finesOwed;
        this.displayName = displayName;
    }

    public String getMembershipPin() {
        return this.membershipPin;
    }

    public static void main(String[] args) {
        // Create an instance of LibraryMember to test it
        LibraryMember member = new LibraryMember("1234", "BR01", 5.0, "John Doe");

        // Print out details to verify it works
        System.out.println("Membership PIN: " + member.getMembershipPin());
        System.out.println("Branch Code: " + member.branchCode);
        System.out.println("Fines Owed: " + member.finesOwed);
        System.out.println("Display Name: " + member.displayName);
    }
}