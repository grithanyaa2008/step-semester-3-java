class HallTicket {
    String studentName;
    int seatNumber;

    public HallTicket(String studentName, int seatNumber) {
        this.studentName = studentName;
        this.seatNumber = seatNumber;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create one HallTicket object for Priya
        HallTicket priya = new HallTicket("Priya", 0);

        // Assign a second variable to point at the same object (reference copy)
        HallTicket copy = priya;

        // Through the second variable, change seatNumber
        copy.seatNumber = 45;

        // Create a third, separate HallTicket object with identical field values
        HallTicket separate = new HallTicket("Priya", 45);

        // Print output matching the specified format
        System.out.println("Priya's seatNumber (via first variable): " + priya.seatNumber);
        System.out.println("copy == priya: " + (copy == priya));
        System.out.println("separate == priya: " + (separate == priya));
    }
}