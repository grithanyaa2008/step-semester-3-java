class BookInventory {
    // Fields
    String title;
    String author;
    int copiesAvailable;

    // Constructor setting all three fields
    public BookInventory(String title, String author, int copiesAvailable) {
        this.title = title;
        this.author = author;
        this.copiesAvailable = copiesAvailable;
    }

    // Instance method to print one formatted line
    public void printEntry() {
        System.out.println(title + " by " + author + " - " + copiesAvailable + " copies available");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an array of 4 BookInventory objects using the sample input data
        BookInventory[] inventory = new BookInventory[] {
            new BookInventory("Clean Code", "Robert C. Martin", 3),
            new BookInventory("Effective Java", "Joshua Bloch", 5),
            new BookInventory("Refactoring", "Martin Fowler", 0),
            new BookInventory("Design Patterns", "GoF", 2)
        };

        // Print each object using a loop
        for (BookInventory book : inventory) {
            book.printEntry();
        }
    }
}