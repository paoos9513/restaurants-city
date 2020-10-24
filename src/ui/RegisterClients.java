package ui;

import model.Client;
import model.Platform;

import java.io.*;
import java.util.Scanner;

public class RegisterClients {
    Scanner scan = new Scanner(System.in);
    Platform platform;

    public RegisterClients() {
        platform = Platform.getInstance();
    }

    public void registerClients() throws IOException {
        String exist = "";
        System.out.println("Enter the document number");
        String numberId = scan.nextLine();

        for (int i = 0; i < platform.getClients().size(); i++) {

            if (numberId.equalsIgnoreCase(platform.getClients().get(i).getNumberId())){
                exist = "The client exist";
            }
        }
        if (exist.equalsIgnoreCase("The client exist")) {
            System.out.println(exist);

        }else {
            System.out.println("Enter the customer's name");
            String clientName = scan.nextLine();
            System.out.println("Enter the customer's last name");
            String clientLastName = scan.nextLine();
            System.out.println("Enter document type");
            String idType = scan.nextLine();
            System.out.println("Enter the telephone number");
            String telephone = scan.nextLine();
            System.out.println("Enter the address");
            String address = scan.nextLine();
            Client client = new Client(clientName, clientLastName, idType, numberId, telephone, address);
            platform.addClients(client);
            System.out.println("El cliente se ha registrado de manera exictosa");

        }
    }
}
