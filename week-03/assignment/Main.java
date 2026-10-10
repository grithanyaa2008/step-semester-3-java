// Class definition for PlacementRecord
class PlacementRecord {
    // Fields
    String studentName;
    String company;
    double packageLpa;

    // Constructor to initialize all three fields
    public PlacementRecord(String studentName, String company, double packageLpa) {
        this.studentName = studentName;
        this.company = company;
        this.packageLpa = packageLpa;
    }

    // Instance method to print formatted record
    public void printRecord() {
        System.out.println(studentName + " -> " + company + " @ " + packageLpa + " LPA");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an array of PlacementRecord objects
        PlacementRecord[] records = new PlacementRecord[3];

        // Instantiate PlacementRecord objects for different students
        records[0] = new PlacementRecord("Ravi", "TCS", 4.5);
        records[1] = new PlacementRecord("Anitha", "Zoho", 6.2);
        records[2] = new PlacementRecord("Karthik", "Infosys", 4.0);

        // Print each object in a loop
        for (PlacementRecord record : records) {
            record.printRecord();
        }
    }
}