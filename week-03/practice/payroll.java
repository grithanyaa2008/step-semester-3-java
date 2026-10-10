class PayrollAccount {
    // Private fields to enforce encapsulation
    private double basicSalary;
    private double bonus;

    // Public constructor with negative salary validation
    public PayrollAccount(double basicSalary) {
        if (basicSalary < 0) {
            System.out.println("Warning: Basic salary cannot be negative. Setting to 0.");
            this.basicSalary = 0;
        } else {
            this.basicSalary = basicSalary;
        }
        this.bonus = 0;
    }

    // Method to add bonus, rejecting amounts <= 0
    public void creditBonus(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid bonus amount. Must be greater than 0.");
        } else {
            this.bonus += amount;
            System.out.println("Bonus credited: Rs " + amount);
        }
    }

    // Method to deduct tax percentage (valid range: 0-100)
    public void deductTax(double percent) {
        if (percent < 0 || percent > 100) {
            System.out.println("Invalid tax percentage. Must be between 0 and 100.");
        } else {
            this.basicSalary -= this.basicSalary * (percent / 100.0);
            System.out.println("Tax deducted: " + (int) percent + "%");
        }
    }

    // Read-only getter for net salary (basicSalary + bonus)
    public double getNetSalary() {
        return this.basicSalary + this.bonus;
    }
}

public class Main {
    public static void main(String[] args) {
        // Initialize payroll account according to sample input
        PayrollAccount account = new PayrollAccount(50000);

        // Perform operations
        account.creditBonus(5000);
        account.deductTax(10);

        // Display final net salary
        System.out.println("Net salary: Rs " + account.getNetSalary());
    }
}