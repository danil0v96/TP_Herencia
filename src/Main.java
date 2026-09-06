import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Client clientIndividual = new ClientIndividual(
                "Danilo", "Escudero", "Analista", "Segurola y Habana",
                "+54 11 5555-0001", "daniloescudero96@gmail.com", 10.0,
                "39.647.702", LocalDate.of(1996, 7, 15)
        );
        Client clientJuridical = new ClientJuridical(
                "Jorge Cocina", "Roca 944", "+54 11 5555-0002", "jorgeroca@gmail.com",
                "20-23414409-5", "Gastronomía", "Germán Martitegui"
        );
        Client clientPremium = new ClientPremium(
                "Panchito", "Francisco Beiró 3949", "+54 11 5555-0003", "francisco39@gmail.com",
                "Pedro Martínez", 100000L, "Atención prioritaria"
        );

        Client.registerClient(clientIndividual);
        Client.registerClient(clientJuridical);
        Client.registerClient(clientPremium);

        Client.listClients();
    }
}
