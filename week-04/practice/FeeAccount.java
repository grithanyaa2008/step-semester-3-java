class FeeAccount {
    // Base class for fee accounts
}

class HostelFeeAccount extends FeeAccount {
    // Derived class for hostel fee accounts
}

public class Main {
    static int hostelCount = 0;
    static int dayScholarCount = 0;

    // Method to process payment using instanceof to dispatch account type
    public static void processPayment(FeeAccount account, double amount) {
        if (account instanceof HostelFeeAccount) {
            System.out.println("Paid in two installments (hostel account)");
            hostelCount++;
        } else if (account instanceof FeeAccount) {
            System.out.println("Paid in one go (day-scholar account)");
            dayScholarCount++;
        }
    }

    public static void main(String[] args) {
        // Create batch of accounts: Hostel, Hostel, FeeAccount, FeeAccount
        FeeAccount[] accounts = {
            new HostelFeeAccount(),
            new HostelFeeAccount(),
            new FeeAccount(),
            new FeeAccount()
        };

        double amount = 60000;

        // Process batch in a single pass
        for (FeeAccount acc : accounts) {
            processPayment(acc, amount);
        }

        // Print final counts
        System.out.println("Hostel accounts processed: " + hostelCount + " | Day-scholar accounts processed: " + dayScholarCount);
    }
}
