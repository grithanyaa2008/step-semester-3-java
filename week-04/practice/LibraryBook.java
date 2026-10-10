class LibraryBook {
    String title;
    String isbn;
    boolean catalogued;

    // Two-argument constructor
    public LibraryBook(String title, String isbn) {
        this.title = title;
        this.isbn = (isbn == null || isbn.trim().isEmpty()) ? "PENDING" : isbn;
        this.catalogued = true;
    }

    // One-argument constructor chaining via this(...)
    public LibraryBook(String title) {
        this(title, "PENDING");
    }

    // Method to print details matching the sample output format
    public void printDetails() {
        System.out.println(title + " | " + isbn + " | Catalogued: " + catalogued);
    }
}

public class Main {
    public static void main(String[] args) {
        String[] titles = {"Clean Code", "Untitled Draft", "1984", "Notes"};
        String[] isbns = {"978-0132350884", "", "9780451524935", ""};

        // Process each entry in a single pass using constructor chaining
        for (int i = 0; i < titles.length; i++) {
            LibraryBook book;
            if (isbns[i] == null || isbns[i].trim().isEmpty()) {
                book = new LibraryBook(titles[i]);
            } else {
                book = new LibraryBook(titles[i], isbns[i]);
            }
            book.printDetails();
        }
    }
}