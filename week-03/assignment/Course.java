public class Course {
    private String code;
    private String title;
    private int credits;
    private int labCredits;

    // Four-argument constructor setting all fields directly
    public Course(String code, String title, int credits, int labCredits) {
        this.code = code;
        this.title = title;
        this.credits = credits;
        this.labCredits = labCredits;
    }

    // Three-argument constructor for theory-only courses, chaining via this(...) with labCredits set to 0
    public Course(String code, String title, int credits) {
        this(code, title, credits, 0);
    }

    // Method returning sum of credits and labCredits
    public int totalCredits() {
        return this.credits + this.labCredits;
    }

    public String getCode() {
        return code;
    }

    public static void main(String[] args) {
        // Creating course objects using both constructors based on sample input
        Course course1 = new Course("21CSC201J", "Data Structures", 4);
        Course course2 = new Course("21CSC205L", "DSA Lab", 3, 1);

        // Printing total credits for both
        System.out.println(course1.getCode() + " total credits: " + course1.totalCredits());
        System.out.println(course2.getCode() + " total credits: " + course2.totalCredits());
    }
}