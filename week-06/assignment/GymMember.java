import java.util.Arrays;
public class GymMember {
    private static int counter = 2000;
    
    private String memberId;
    private final String membershipNumber; 
    private int monthlyFee;
    private int sessionsAttended;
    private int feesPaid;
    
    // For Problem 3: Late Fee Ledger
    private int[] lateFeeHistory = new int[10];
    private int lateFeeCount = 0;

    // Constructor for Problem 1 (validates ID)
    public GymMember(String memberId, int monthlyFee) {
        if (memberId == null || memberId.trim().isEmpty() || memberId.length() < 4) {
            throw new IllegalArgumentException("construction rejected");
        }
        this.memberId = memberId;
        this.monthlyFee = monthlyFee;
        this.membershipNumber = "GYM-" + (++counter);
    }

    // Constructor for Problem 5 (auto-generates ID)
    public GymMember(int monthlyFee) {
        this("MEM-" + (++counter), monthlyFee);
    }

    public void attendSession() {
        sessionsAttended++;
    }

    public int getSessionsAttended() {
        return sessionsAttended;
    }

    public String getMembershipNumber() {
        return membershipNumber;
    }

    public static int getMembersEnrolled() {
        return counter - 2000;
    }

    // Problem 3: Late Fee Ledger
    protected void chargeLateFee(int amount) {
        if (lateFeeCount < lateFeeHistory.length) {
            lateFeeHistory[lateFeeCount++] = amount;
        }
    }

    public int[] getLateFeeHistory() {
        return Arrays.copyOf(lateFeeHistory, lateFeeCount);
    }

    public int getTotalLateFees() {
        int sum = 0;
        for (int i = 0; i < lateFeeCount; i++) {
            sum += lateFeeHistory[i];
        }
        return sum;
    }

    // Problem 5: Overloaded payFee methods
    public void payFee(int amount) {
        feesPaid += amount;
    }

    public void payFee(int amount, String mode) {
        this.payFee(amount); // Reuse flat version
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    // Problem 2 & 4: Polymorphic displayInfo
    public String displayInfo() {
        return "Standard | Sessions: " + sessionsAttended;
    }
}