import java.util.Arrays;

// 1. Public class - MUST match the file name
public class LoanReceipt {
    private final String memberId;
    private final String[] bookIds;

    public LoanReceipt(String memberId, String[] bookIds) {
        this.memberId = memberId;
        this.bookIds = (bookIds == null) ? new String[0] : Arrays.copyOf(bookIds, bookIds.length);
    }

    public String getMemberId() { return memberId; }

    public String[] getBookIds() {
        return Arrays.copyOf(bookIds, bookIds.length);
    }

    public LoanReceipt withCorrectedBookId(int index, String newId) {
        if (index < 0 || index >= bookIds.length) return this;
        String[] newIds = Arrays.copyOf(bookIds, bookIds.length);
        newIds[index] = newId;
        return new LoanReceipt(this.memberId, newIds);
    }
}

// 2. Cannot be public because it's in the same file as public LoanReceipt
class ReferenceOnlyLoanReceipt extends LoanReceipt {
    private final String roomNumber;

    public ReferenceOnlyLoanReceipt(String memberId, String[] bookIds, String roomNumber) {
        super(memberId, bookIds);
        this.roomNumber = roomNumber;
    }

    public String getRoomNumber() { return roomNumber; }
}

// 3. Cannot be public because it's in the same file as public LoanReceipt
class CirculationLedger {
    public static String branchCode;

    static {
        branchCode = "MAIN-BRANCH-01";
    }

    public static String processNightlyCirculation(LoanReceipt[] receipts) {
        if (receipts == null) return "0 processed | 0 null skipped | 0 reference-only | 0 regular";
        
        int processed = 0, nullSkipped = 0, referenceOnly = 0, regular = 0;
        for (LoanReceipt r : receipts) {
            if (r == null) { nullSkipped++; continue; }
            processed++;
            if (r instanceof ReferenceOnlyLoanReceipt) referenceOnly++;
            else regular++;
        }
        return processed + " processed | " + nullSkipped + " null skipped | " + referenceOnly + " reference-only | " + regular + " regular";
    }
}