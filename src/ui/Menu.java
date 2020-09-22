package ui;

import model.CityRestaurants;
import model.Product;

import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);
    int opt;
    CityRestaurants cityRestaurants;
    RegisterRestaurants registerTheRestaurant = new RegisterRestaurants();
    RegisterProducts registerTheProduct = new RegisterProducts();
    RegisterClients registerTheClient = new RegisterClients();
    RegisterOrder registerTheOrder= new RegisterOrder();

    public Menu (){
        show();
        menu();
    }
    public void show(){
        System.out.println(" ");
        System.out.println("************************************");
        System.out.println(" WELCOME TO THE DOMICILES PLATFORM ");
        System.out.println("************************************");
    }

    public void menu(){
        while (opt!=13) {
            System.out.println(" ");
            System.out.println("----------------MENU----------------");
            System.out.println("Select the option you want \n");
            System.out.println("(1).Register Restaurant \n" +
                    "(2).Register Product \n" +
                    "(3).Register Client \n" +
                    "(4).Register Order \n" +
                    "(5).Order Status \n" +
                    "(6).Update Restaurant Data \n" +
                    "(7).Update Product Data \n" +
                    "(8).Update Client Data \n" +
                    "(9).Update Order Data \n" +
                    "(10).Save Information \n" +
                    "(11).Save Update \n" +
                    "(12).Print \n" +
                    "(13).Import \n" +
                    "(14).Closed \n"
            );
        opt = Integer.parseInt(scan.nextLine());


            switch (opt) {

                case 1:
                    registerTheRestaurant.registerRestaurants();
                    break;
                case 2:
                    registerTheProduct.registerProducts();
                    break;

                case 3:
                    registerTheClient.registerClients();
                    break;

                case 4:
                    registerTheOrder.registerOrder();
                    break;

                case 5:

                    break;

                case 6:

                    break;

                case 7:
                    break;

                case 8:
                    break;

                case 9:

                    break;

                case 10:

                    break;

                case 11:

                    break;

                case 12:

                    break;

                case 13:
                    scan.close();
                    break;
                default:
                    System.out.println("The option is incorrect");
            }
        }

    }

}
