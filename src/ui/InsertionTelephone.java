package ui;

import model.Client;
import model.Platform;

public class InsertionTelephone {
    Platform platform;
    public InsertionTelephone(){
        platform = Platform.getInstance();

    }

    public void insertionTelephone() {
        int sizeArray = platform.getClients().size();
        Client[] clients1 = new Client[sizeArray];

        for (int i = 0; i < clients1.length; i++) {
            clients1[i] = platform.getClients().get(i);
        }
        for (int i = 1; i < clients1.length; i++) {
            Client aux = clients1[i];
            int j;

            for (j = i - 1; j >= 0 && (Integer.parseInt(clients1[j].getTelephone()) < Integer.parseInt(aux.getTelephone())); j--) {
                clients1[j + 1] = clients1[j];
            }
            clients1[j + 1] = aux;
        }
        System.out.println("Insertion");
        for (int i = 0; i < sizeArray; i++) {
            System.out.println(clients1[i].getTelephone() + " " + clients1[i].getTelephone());
        }

    }
}
