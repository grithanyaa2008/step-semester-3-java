public class PremiumMember extends GymMember {
    private String trainerName;

    public PremiumMember(String memberId, int monthlyFee, String trainerName) {
        super(memberId, monthlyFee); // Forward shared fields
        this.trainerName = trainerName;
    }

    public String getTrainerName() {
        return trainerName;
    }

    // Problem 3: Override with discount using super
    @Override
    protected void chargeLateFee(int amount) {
        super.chargeLateFee(amount / 2);
    }

    @Override
    public String displayInfo() {
        return "Premium | Trainer: " + trainerName + " | Sessions: " + getSessionsAttended();
    }
}