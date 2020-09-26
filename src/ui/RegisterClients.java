package ui;

import model.CityRestaurants;
import model.Client;
import model.Platform;

import java.util.Scanner;

public class RegisterClients {

    Scanner scan = new Scanner(System.in);
    int opt;

    Platform platform;

    public RegisterClients() {
        platform = Platform.getInstance();
    }

    public void registerClients() {

        System.out.println("How many clients do you want to register?");
        opt = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < opt; i++) {

            System.out.println("Enter the customer's name");
            String clientName = scan.nextLine();

            System.out.println("Enter the customer's last name");
            String clientLastName = scan.nextLine();
            System.out.println("Enter document type");
            String idType = scan.nextLine();
            System.out.println("Enter the document number");
            String numberId = scan.nextLine();
            System.out.println("Enter the telephone number");
            String telephone = scan.nextLine();
            System.out.println("Enter the address");
            String address = scan.nextLine();

            Client clients = new Client(clientName, clientLastName, idType, numberId, telephone, address);
            if (platform.getClients().isEmpty()){
                platform.addClients(clients);
            }else {
                int c = 0;
                while (clients.getClientName().equals(platform.getClients().get(c).getClientName())){
                    c++;
                }
                platform.addClients(clients);
            }
            platform.addClients(clients);
            System.out.println("El cliente se ha registrado de manera exictosa");
        }
        //Prueba de funcion
        for (int i = 0; i < platform.getClients().size(); i++) {
            Client client = platform.getClients().get(i);
            System.out.println("Cliente : " + i);
            System.out.println("Nombre : " + client.getClientName() + " " + client.getClientLastName());
            System.out.println("el nombre del producto es: " + client.getIdType());
            System.out.println("la descripcion del producto es : " + client.getNumberId());
            System.out.println("el nit del restaurante es : " + client.getTelephone());
            System.out.println("el precio del producto es : " + client.getAddress());

        }
    }
}
