public class ClientPremium extends Client {

    private Long creditLimit;
    private String assignedExecutive;
    private String additionalBenefits;

    public ClientPremium(String name, String address, String phone, String email,
                         String assignedExecutive, Long creditLimit, String additionalBenefits) {
        super(name, address, phone, email);
        this.assignedExecutive = assignedExecutive;
        this.creditLimit = creditLimit;
        this.additionalBenefits = additionalBenefits;
    }

    public Long getCreditLimit() { return creditLimit; }
    public void setCreditLimit(Long creditLimit) { this.creditLimit = creditLimit; }
    public String getAssignedExecutive() { return assignedExecutive; }
    public void setAssignedExecutive(String assignedExecutive) { this.assignedExecutive = assignedExecutive; }
    public String getAdditionalBenefits() { return additionalBenefits; }
    public void setAdditionalBenefits(String additionalBenefits) { this.additionalBenefits = additionalBenefits; }

    @Override
    public String toString() {
        String specificInformation =
                "Credit limit: " + creditLimit + "\n" +
                "Assigned executive: " + assignedExecutive + "\n" +
                "Additional benefits: " + additionalBenefits + "\n";

        return formatClientInformation("Premium", specificInformation);
    }
}
