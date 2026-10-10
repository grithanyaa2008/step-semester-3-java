public class NightlySettlement {
    
    public static String processNightlySettlement(BookingReceipt[] receipts) {
        if (receipts == null) return "0 processed | 0 null skipped | 0 groups | 0 individuals";

        int processed = 0;
        int nullSkipped = 0;
        int groups = 0;
        int individuals = 0;

        for (BookingReceipt receipt : receipts) {
            // Tolerate null placeholder entries without crashing
            if (receipt == null) {
                nullSkipped++;
                continue;
            }
            processed++;
            
            // instanceof-based dispatch
            if (receipt instanceof GroupBookingReceipt) {
                groups++;
            } else {
                individuals++;
            }
        }

        return processed + " processed | " + nullSkipped + " null skipped | " + groups + " groups | " + individuals + " individuals";
    }
}