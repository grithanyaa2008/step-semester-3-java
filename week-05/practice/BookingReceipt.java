import java.util.Arrays;

public class BookingReceipt {
    private final String bookingId;
    private final String[] seatNumbers;

    public BookingReceipt(String bookingId, String[] seatNumbers) {
        this.bookingId = bookingId;
        // Defensive copy on the way in
        this.seatNumbers = (seatNumbers == null) ? new String[0] : Arrays.copyOf(seatNumbers, seatNumbers.length);
    }

    public String getBookingId() { 
        return bookingId; 
    }

    // Defensive copy on the way out
    public String[] getSeatNumbers() {
        return Arrays.copyOf(seatNumbers, seatNumbers.length);
    }

    // with-style method returns a brand new object, leaving the original untouched
    public BookingReceipt withUpdatedSeat(int index, String newSeat) {
        if (index < 0 || index >= seatNumbers.length) return this;
        String[] newSeats = Arrays.copyOf(seatNumbers, seatNumbers.length);
        newSeats[index] = newSeat;
        return new BookingReceipt(this.bookingId, newSeats);
    }
}