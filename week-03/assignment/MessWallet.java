class MessWallet {
    // Private field for balance encapsulation
    private double balance;

    // Constructor accepting opening balance
    public MessWallet(double openingBalance) {
        if (openingBalance < 0) {
            System.out.println("Warning: Initial balance cannot be negative. Setting balance to 0.0");
            this.balance = 0.0;
        } else {
            this.balance = openingBalance;
        }
    }

    // Top up method
    public void topUp(double amount) {
        if (amount <= 0) {
            System.out.println("Top-up rejected: amount must be greater than 0");
        } else {
            this.balance += amount;
            System.out.println("Balance after top-up: " + this.balance);
        }
    }

    // Deduct method
    public void deduct(double amount) {
        if (amount > this.balance) {
            System.out.println("Deduct rejected: insufficient balance");
        } else if (amount <= 0) {
            System.out.println("Deduct rejected: amount must be greater than 0");
        } else {
            this.balance -= amount;
            System.out.println("Balance after deduction: " + this.balance);
        }
    }

    // Read-only getter for balance
    public double getBalance() {
        return this.balance;
    }
}

public class Main {
    public static void main(String[] args) {
        // Sample execution matching the problem description
        MessWallet wallet = new MessWallet(500);
        
        wallet.topUp(200);
        wallet.deduct(1000);
        
        System.out.println("Final balance: " + wallet.getBalance());
    }
}