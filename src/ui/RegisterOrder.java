package ui;

import model.CityRestaurants;
import model.Order;
import model.Platform;
import model.Product;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class RegisterOrder {
    Scanner scan = new Scanner(System.in);
    int opt;

    Platform platform;
    UpdateInformation updateInformation;

    public RegisterOrder() {
        platform = Platform.getInstance();
    }

    public void registerOrder() {
        String state = " ";
        String codeProduct = "";
        int quantity = 0;
        String orderCode = String.valueOf((int) (1000000 * Math.random()));
        //organizar bien la hora y la fecha, por aparte
        Date date = new Date();
        Date hour = new Date();
        System.out.println("Enter the customer's document number: ");
        String idClient = scan.nextLine();
        System.out.println("Enter the NIT of the restaurant that the order belong to");
        String nitRestaurant = scan.nextLine();
        String listProduct = scan.nextLine();

        ArrayList<Product> products = new ArrayList();
        int opt = -1;

        while (opt != 1) {
            System.out.println("Enter Products?");
            System.out.println("	1. No");
            System.out.println("	2. Si");
            opt = Integer.parseInt(scan.nextLine());
            if (opt == 2) {
                System.out.println("cuantos productos va a registrar?");
                opt = Integer.parseInt(scan.nextLine());
                for (int i = 0; i < opt; i++) {
                    System.out.println("Por favor igrese el codigo del producto ");
                    codeProduct = scan.nextLine();
                    Product temp = platform.addProductsToOrder(codeProduct);
                    products.add(temp);
                    System.out.println("Enter the amount");
                    quantity = Integer.parseInt(scan.nextLine());
                }
            }
        }

        System.out.println("Enter de order status");
        System.out.println("(1).REQUESTED");
        System.out.println("(2).PROCESS");
        System.out.println("(3).SENT");
        System.out.println("(4).Delivered");

        int stateOpt = Integer.parseInt(scan.nextLine());

        if (stateOpt == 1) {
            state = "Requested";
        } else if (stateOpt == 2) {
            state = "Process";
        } else if (stateOpt == 3) {
            state = "Sent";
        } else if (stateOpt == 4) {
            state = "Delivered";

        } else {
            System.out.println("The option incorrect");
        }
        //updateInformation.updateStatusOrder(state);
        //Falta la lista de productos
        Order order = new Order(orderCode, codeProduct, quantity, date, hour, idClient, nitRestaurant, listProduct, state);
        platform.addOrders(order);
        System.out.println("La orden se ha registrado de manera exictosa");
    }

}
