import java.util.Arrays;

public class LibraryMember {
    private static int counter = 100;
    public final String memberNumber;
    
    private String memberId;
    private int borrowLimit;
    private int booksBorrowed;
    
    private int[] fineHistory = new int[10];
    private int fineCount = 0;
    public LibraryMember(String memberId, int borrowLimit) {
        if (memberId == null || memberId.trim().isEmpty() || memberId.length() < 4) {
            throw new IllegalArgumentException("construction rejected");
        }
        this.memberId = memberId;
        this.borrowLimit = borrowLimit;
        this.memberNumber = "LIB-" + (++counter);
    }
    public LibraryMember(int borrowLimit) {
        this.memberId = "MEM-" + (counter + 1);
        this.borrowLimit = borrowLimit;
        this.memberNumber = "LIB-" + (++counter);
    }
    public void borrowBook() {
        booksBorrowed++;
    }

    public void borrowBook(String genre) {
        this.borrowBook(); 
    }

    public int getBooksBorrowed() {
        return booksBorrowed;
    }
    protected void chargeFine(int amount) {
        if (fineCount < fineHistory.length) {
            fineHistory[fineCount++] = amount;
        }
    }
    public int[] getFineHistory() {
        return Arrays.copyOf(fineHistory, fineCount);
    }

    public int getTotalFine() {
        int sum = 0;
        for (int i = 0; i < fineCount; i++) {
            sum += fineHistory[i];
        }
        return sum;
    }

    public static int getMembersEnrolled() {
        return counter - 100;
    }
    public String displayInfo() {
        return "General | Books: " + booksBorrowed;
    }
}
