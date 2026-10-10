public class MovieBookingProfile {
    private String name;
    private boolean confirmed;
    private String otp; // Write-only property

    // Public no-argument constructor
    public MovieBookingProfile() {}

    // Convenience constructor that chains to the no-arg constructor
    public MovieBookingProfile(String name) {
        this(); // Chains to the no-arg constructor
        this.name = name;
    }

    public String getName() { 
        return name; 
    }

    public void setName(String name) { 
        this.name = name; 
    }

    // isX convention for boolean JavaBean property
    public boolean isConfirmed() { 
        return confirmed; 
    }

    public void setConfirmed(boolean confirmed) { 
        this.confirmed = confirmed; 
    }

    // Write-only: Setter exists, but NO getter exists anywhere
    public void setOtp(String otp) {
        this.otp = otp;
    }
}