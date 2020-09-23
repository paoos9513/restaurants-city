package ui;

import model.CityRestaurants;
import model.Order;

import java.util.Date;
import java.util.Scanner;

public class RegisterOrder {
    Scanner scan = new Scanner(System.in);
    int opt ;
    CityRestaurants cityRestaurants;
    public RegisterOrder(){
        cityRestaurants = new CityRestaurants("","","");
    }

    public void registerOrder(){

        System.out.println("How many orders do you want to register?");
        opt = Integer.parseInt(scan.nextLine());

        for(int i = 0; i<opt; i++){
            int orderCode = (int)(1000000 * Math.random());
            System.out.println("Enter product code");
            int codeProduct = Integer.parseInt(scan.nextLine());
            System.out.println("Enter the amount");
            int quantity = Integer.parseInt(scan.nextLine());
            Date date = new Date();
            Date hour= new Date();
            System.out.println("Enter the document number");
            String idClient = scan.nextLine();
            System.out.println("Enter NIT");
            String nitRestaurant = scan.nextLine();
            String listProduct = scan.nextLine();
            //Falta la lista de productos

            Order order = new Order(orderCode,
                                    codeProduct,
                                    quantity,
                                    date,
                                    hour,
                                    idClient,
                                    nitRestaurant,
                                    listProduct
            );

            cityRestaurants.addOrders(order);
            System.out.println("El cliente se ha registrado de manera exictosa");
        }
        //Prueba de funcion
        for (int i = 0; i < cityRestaurants.getOrders().size() ; i++) {
            Order order = cityRestaurants.getOrders().get(i);
            System.out.println("Resturante Numero: " + i);
            System.out.println("codigo de order es :" + order.getOrderCode());
            System.out.println("codigo de producto es  :" + order.getCodeProduct());
            System.out.println("La cantidad es : " + order.getQuantity());
            System.out.println("Fecha solicitud: " + order.getDate());
            System.out.println("hora solicitud: " + order.getDate());
            System.out.println("el id cliente es : " + order.getIdClient());
            System.out.println("el nit de restaurante es : " + order.getNitRestaurant());
            System.out.println("Lista de Productos : " + order.getListProducts());

        }
    }
}
