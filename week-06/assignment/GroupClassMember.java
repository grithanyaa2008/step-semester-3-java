package week06.assignment;

public class GroupClassMember extends GymMember {
    private String className;

    public GroupClassMember(String memberId, int monthlyFee, String className) {
        super(memberId, monthlyFee);
        this.className = className;
    }

    // Problem 5: Constructor for auto-generated ID
    public GroupClassMember(int monthlyFee, String className) {
        super(monthlyFee);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    @Override
    public String displayInfo() {
        return "Group Class | Class: " + className + " | Sessions: " + getSessionsAttended();
    }
}