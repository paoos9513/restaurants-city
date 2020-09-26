package ui;

import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);
    int opt;

    RegisterRestaurants registerTheRestaurant = new RegisterRestaurants();
    RegisterProducts registerTheProduct = new RegisterProducts();
    RegisterClients registerTheClient = new RegisterClients();
    RegisterOrder registerTheOrder = new RegisterOrder();
    UpdateInformation updateInformation = new UpdateInformation();
    SearchClient searchClient = new SearchClient();
    InsertionTelephone insertionTelephone = new InsertionTelephone();

    public Menu() {
        show();
        menu();
    }

    public void show() {
        System.out.println(" ");
        System.out.println("************************************");
        System.out.println(" WELCOME TO THE DOMICILES PLATFORM ");
        System.out.println("************************************");
    }

    public void menu() {
        while (opt != 14) {
            System.out.println(" ");
            System.out.println("----------------MENU----------------");
            System.out.println("Select the option you want \n");
            System.out.println("(1).Register Restaurant \n" +
                    "(2).Register Product \n" +
                    "(3).Register Client \n" +
                    "(4).Register Order \n" +
                    "(5).Update Restaurant Data \n" +
                    "(6).Update Product Data \n" +
                    "(7).Update Client Data \n" +
                    "(8).Update Order Data \n" +
                    "(9). Search Client \n" +
                    "(10).Show sort for telephone number \n" +
                    "(11). \n" +
                    "(12).Import \n" +
                    "(13).Show data base \n" +
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
                    updateInformation.updateRestaurant();
                    break;

                case 6:
                    updateInformation.updateProduct();
                    break;

                case 7:
                    updateInformation.updateClient();
                    break;

                case 8:
                    updateInformation.updateOrder();
                    break;

                case 9:
                    searchClient.searchClient1();
                    break;

                case 10:
                    insertionTelephone.insertionTelephone();
                    break;

                case 11:

                    break;
                case 12:
                    break;
                case 13:
                    new SubMenu();
                    break;
                case 14:
                    scan.close();
                    break;
                default:
                    System.out.println("The option is incorrect");
            }
        }

    }

}
