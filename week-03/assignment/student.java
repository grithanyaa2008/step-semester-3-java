class Student {
    // Instance fields
    String name;
    int attendance;

    // Static fields shared by all instances
    static String collegeName = "SRM Institute of Science and Technology";
    static int studentCount = 0;

    // Constructor incrementing static studentCount
    public Student(String name, int attendance) {
        this.name = name;
        this.attendance = attendance;
        studentCount++;
    }

    // Static method accessing only static members
    public static void printCollegeInfo() {
        System.out.println(collegeName);
        System.out.println("Students created: " + studentCount);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create two Student objects
        Student s1 = new Student("Alice", 90);
        Student s2 = new Student("Bob", 85);

        // Call printCollegeInfo() directly through the class name
        Student.printCollegeInfo();
    }
}
