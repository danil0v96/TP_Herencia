import java.time.LocalDate;

public class ClientIndividual extends Client {
    private String profession;
    private String lastName;
    private Double declaredIncome;
    private String document;
    private LocalDate birthDate;

    public ClientIndividual(String name, String lastName, String profession, String address,
                            String phone, String email, Double declaredIncome, String document,
                            LocalDate birthDate) {
        super(name, address, phone, email);
        this.profession = profession;
        this.lastName = lastName;
        this.declaredIncome = declaredIncome;
        this.document = document;
        this.birthDate = birthDate;
    }

    public String getProfession() { return profession; }
    public void setProfession(String profession) { this.profession = profession; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public Double getDeclaredIncome() { return declaredIncome; }
    public void setDeclaredIncome(Double declaredIncome) { this.declaredIncome = declaredIncome; }
    public String getDocument() { return document; }
    public void setDocument(String document) { this.document = document; }
    public LocalDate getBirthDate() { return birthDate; }
    public void setBirthDate(LocalDate birthDate) { this.birthDate = birthDate; }

    @Override
    public String toString() {
        String specificInformation =
                "Last name: " + lastName + "\n" +
                "Profession: " + profession + "\n" +
                "DNI: " + document + "\n" +
                "Birth date: " + birthDate + "\n" +
                "Declared income: " + declaredIncome + "\n";

        return formatClientInformation("Individual", specificInformation);
    }
}
