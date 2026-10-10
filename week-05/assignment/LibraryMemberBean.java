public class LibraryMemberBean {
    private String membershipId;
    private String name;
    private boolean premiumMember;
    private String securityAnswer; // Write-only

    public LibraryMemberBean() {}

    public String getMembershipId() { return membershipId; }

    // Write-once: only takes effect on first call
    public void setMembershipId(String id) {
        if (this.membershipId == null) {
            this.membershipId = id;
        }
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    // isX for boolean JavaBean convention
    public boolean isPremiumMember() { return premiumMember; }
    public void setPremiumMember(boolean premium) { this.premiumMember = premium; }

    // Write-only: NO getter exists anywhere
    public void setSecurityAnswer(String answer) {
        this.securityAnswer = Integer.toHexString(answer.hashCode());
    }
}