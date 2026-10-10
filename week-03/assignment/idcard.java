class IdCard {
    String name;
    int booksIssued;

    public IdCard(String name, int booksIssued) {
        this.name = name;
        this.booksIssued = booksIssued;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create one IdCard object for Ravi
        IdCard ravi = new IdCard("Ravi", 0);

        // Assign a second variable to point at the same object (reference copy)
        IdCard duplicate = ravi;

        // Through the second variable, change booksIssued
        duplicate.booksIssued = 3;

        // Create a third, separate IdCard object with identical field values
        IdCard separate = new IdCard("Ravi", 3);

        // Print output as specified
        System.out.println("Ravi's booksIssued (via first variable): " + ravi.booksIssued);
        System.out.println("duplicate == ravi: " + (duplicate == ravi));
        System.out.println("separate == ravi: " + (separate == ravi));
    }
}