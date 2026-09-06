import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Client {

    private static int clientCount = 0;
    private static final List<Client> clients = new ArrayList<>();

    private final Long id;
    private String name;
    private String address;
    private String phone;
    private String email;
    private final LocalDate registerDate;
    private ClientStatus status;

    protected Client(String name, String address, String phone, String email) {
        clientCount++;
        this.id = (long) clientCount;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.registerDate = LocalDate.now();
        this.status = ClientStatus.ACTIVE;
    }

    public static void registerClient(Client client) {
        clients.add(client);
    }

    public static List<Client> getClients() {
        return List.copyOf(clients);
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public LocalDate getRegisterDate() { return registerDate; }
    public ClientStatus getStatus() { return status; }
    public void setStatus(ClientStatus status) { this.status = status; }

    public static void listClients() {
        System.out.println("Total clients: " + clients.size());
        for (Client client : clients) {
            System.out.println(client);
        }
    }

    protected String formatClientInformation(String clientType, String specificInformation) {
        return "============\n" +
                "CLIENT: " + clientType + "\n" +
                "============\n" +
                "ID: " + id + "\n" +
                "Status: " + status + "\n" +
                "Name: " + name + "\n" +
                specificInformation +
                "Address: " + address + "\n" +
                "Phone: " + phone + "\n" +
                "Email: " + email + "\n" +
                "Register date: " + registerDate + "\n" +
                "============\n" +
                "END\n" +
                "============";
    }
}
