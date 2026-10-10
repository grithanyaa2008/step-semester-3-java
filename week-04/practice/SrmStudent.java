class SrmStudent {
    // Static fields loaded once for all instances
    static String collegeName;
    static String academicYear;

    // Instance field
    String name;

    // Static initialization block runs exactly once when class is loaded
    static {
        collegeName = "SRM Institute of Science and Technology";
        academicYear = "2024-2025";
        System.out.println("College info loaded");
    }

    // Constructor printing short confirmation line
    public SrmStudent(String name) {
        this.name = name;
        System.out.println("Student record created: " + this.name);
    }
}

public class Main {
    public static void main(String[] args) {
        String[] names = {"Ravi", "Meera", "Karthik", "Divya", "Anitha"};

        // Creating multiple student objects in a loop
        SrmStudent[] students = new SrmStudent[names.length];
        for (int i = 0; i < names.length; i++) {
            students[i] = new SrmStudent(names[i]);
        }
    }
}