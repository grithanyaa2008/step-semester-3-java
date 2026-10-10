public class CsvParser {

    public static void parseInventoryRecord(String csvLine) {
        String[] fields = csvLine.split(",");

        if (fields.length != 3) {
            System.out.println("Invalid Record");
        } else {
            System.out.println("Product: " + fields[0] + " | SKU: " + fields[1] + " | Qty: " + fields[2]);
        }
    }

    public static void main(String[] args) {
        // Test cases from the assignment
        parseInventoryRecord("Wireless Mouse,WM-2201,150"); // Valid record
        parseInventoryRecord("Wireless Mouse,150");         // Invalid record
    }
}
public class CsvParser {

    public static void parseInventoryRecord(String csvLine) {
        String[] fields = csvLine.split(",");

        if (fields.length != 3) {
            System.out.println("Invalid Record");
        } else {
            System.out.println("Product: " + fields[0] + " | SKU: " + fields[1] + " | Qty: " + fields[2]);
        }
    }

    public static void main(String[] args) {
        // Test cases from the assignment
        parseInventoryRecord("Wireless Mouse,WM-2201,150"); // Valid record
        parseInventoryRecord("Wireless Mouse,150");         // Invalid record
    }
}
