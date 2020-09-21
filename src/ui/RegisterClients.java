package ui;

import model.CityRestaurants;
import model.Client;
import model.Product;

import java.util.Scanner;

public class RegisterClients {
    Scanner scan = new Scanner(System.in);
    int opt ;
   // Client client = new Client("", "", "", "", "");
    CityRestaurants cityRestaurants = new CityRestaurants("","","");
    public RegisterClients(){

    }

    public void registerClients(){

        System.out.println("How many clients do you want to register?");
        opt = Integer.parseInt(scan.nextLine());

        for(int i = 0; i<opt; i++){

            System.out.println("Enter the customer's full name");
            String fullClientName = scan.nextLine();
            System.out.println("Enter document type");
            String idType = scan.nextLine();
            System.out.println("Enter the document number");
            String numberId = scan.nextLine();
            System.out.println("Enter the telephone number");
            String telephone = scan.nextLine();
            System.out.println("Enter the address");
            String address = scan.nextLine();

            Client clients = new Client(fullClientName,
                    idType,
                    numberId,
                    telephone,
                    address
            );

            cityRestaurants.addClients(clients);
            System.out.println("El cliente se ha registrado de manera exictosa");
        }
        //Prueba de funcion
        for (int i = 0; i < cityRestaurants.getProducts().size() ; i++) {
            Product product = cityRestaurants.getProducts().get(i);
            System.out.println("Resturante Numero: " + i);
            System.out.println("codigo de producto es : " + product.getProductCode());
            System.out.println("el nombre del producto es: " + product.getProductName());
            System.out.println("la descripcion del producto es : " + product.getProductDescription());
            System.out.println("el nit del restaurante es : " + product.getRestaurantNit());
            System.out.println("el precio del producto es : " + product.getProductValue());

        }
    }
}
