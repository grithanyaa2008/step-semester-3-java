package week05.assignment.p1;

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
}