public class ClientJuridical extends Client {
    private String cuit;
    private String activity;
    private String legalRepresentative;

    public ClientJuridical(String name, String address, String phone, String email, String cuit,
                           String activity, String legalRepresentative) {
        super(name, address, phone, email);
        this.cuit = cuit;
        this.activity = activity;
        this.legalRepresentative = legalRepresentative;
    }

    public String getCuit() { return cuit; }
    public void setCuit(String cuit) { this.cuit = cuit; }
    public String getActivity() { return activity; }
    public void setActivity(String activity) { this.activity = activity; }
    public String getLegalRepresentative() { return legalRepresentative; }
    public void setLegalRepresentative(String legalRepresentative) { this.legalRepresentative = legalRepresentative; }

    @Override
    public String toString() {
        String specificInformation =
                "CUIT: " + cuit + "\n" +
                "Activity: " + activity + "\n" +
                "Legal representative: " + legalRepresentative + "\n";

        return formatClientInformation("Juridical", specificInformation);
    }
}
