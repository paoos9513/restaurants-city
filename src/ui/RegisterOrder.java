package ui;

import model.CityRestaurants;
import model.Order;
import model.Platform;
import model.Product;

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
        System.out.println("How many orders do you want to register?");
        opt = Integer.parseInt(scan.nextLine());


        for (int i = 0; i < opt; i++) {
            String orderCode = String.valueOf((int) (1000000 * Math.random()));
            System.out.println("Enter product code");
            String codeProduct = scan.nextLine();
            System.out.println("Enter the amount");
            int quantity = Integer.parseInt(scan.nextLine());

            //organizar bien la hora y la fecha, por aparte

            Date date = new Date();
            Date hour = new Date();

            System.out.println("Enter the customer's document number: ");
            String idClient = scan.nextLine();
            System.out.println("Enter the NIT of the restaurant that the order belong to");
            String nitRestaurant = scan.nextLine();
            String listProduct = scan.nextLine();
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
        //Prueba de funcion

        for (int i = 0; i < platform.getOrders().size(); i++) {
            Order order = platform.getOrders().get(i);
            System.out.println("Resturante Numero: " + i);
            System.out.println("codigo de order es :" + order.getOrderCode());
            System.out.println("codigo de producto es  :" + order.getCodeProduct());
            System.out.println("La cantidad es : " + order.getQuantity());
            System.out.println("Fecha solicitud: " + order.getDate());
            System.out.println("hora solicitud: " + order.getDate());
            System.out.println("el id cliente es : " + order.getIdClient());
            System.out.println("el nit de restaurante es : " + order.getNitRestaurant());
            System.out.println("Lista de Productos : " + order.getListProducts());
            System.out.println("Status: " + order.getState());
        }
    }
}
