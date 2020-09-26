package ui;

import controller.CityRestaurantsController;
import model.CityRestaurants;
import model.Order;
import model.Platform;
import model.Product;

import java.util.Scanner;

public class UpdateInformation {

    int opt;
    Scanner scan = new Scanner(System.in);
    Platform platform;
    CityRestaurantsController cityRestaurantsController;
    CityRestaurants cityRestaurants;
    Product product;
    Order order;

    public UpdateInformation() {
        platform = Platform.getInstance();
    }

   //registra la actualizacion de un restaurante
    public void updateRestaurant() {

        System.out.println("Enter the NIT of the restaurant you want to update");
        String nitS = scan.nextLine();

        for (int i = 0; i < platform.getRestaurants().size(); i++) {

            if (nitS.equals(platform.getRestaurants().get(i).getNit())) {

                System.out.println(" ");
                System.out.println("----------------UPDATE----------------");
                System.out.println("Select the option you want to update \n");
                System.out.println("(1).Restaurant name \n" +
                        "(2).NIT \n" +
                        "(3).Administrator name \n"
                );
                opt = Integer.parseInt(scan.nextLine());
                switch (opt) {
                    case 1:
                        System.out.println("Enter the new restaurant name");
                        String restaurantName = scan.nextLine();
                        platform.getRestaurants().get(i).setRestaurantName(restaurantName);
                        break;
                    case 2:
                        System.out.println("Enter the new restaurant NIT");
                        String nit = scan.nextLine();
                        platform.getRestaurants().get(i).setNit(nit);
                        break;
                    case 3:
                        System.out.println("Enter the new name of the restaurant manager");
                        String administratorName = scan.nextLine();
                        platform.getRestaurants().get(i).setAdministratorName(administratorName);
                        break;
                    case 4:
                        new Menu();
                        break;
                    default:
                        System.out.println("the option incorrect");
                }
                System.out.println("la info se ha cambiado");
            }else {
                System.out.println("The restaurant doest not exist");
            }
        }

    }
//registra la actualizacion de un producto
    public void updateProduct(){

        System.out.println("Enter the code of the product you want to update");
        String codeSearch = scan.nextLine();

        for (int i = 0; i < platform.getProducts().size(); i++) {

            if (codeSearch.equals(platform.getProducts().get(i).getProductCode())) {

                System.out.println(" ");
                System.out.println("----------------UPDATE----------------");
                System.out.println("Select the option you want to update \n");
                System.out.println("(1).Product name \n" +
                        "(2).Product description \n" +
                        "(3).NIT of the restaurant to which the product belong \n"+
                        "(4).Product description \n" +
                        "(5).NIT of the restaurant to which the product belong \n"
                );
                opt = Integer.parseInt(scan.nextLine());
                switch (opt) {
                    case 1:
                        System.out.println("Enter the new restaurant name");
                        String restaurantName = scan.nextLine();
                        platform.getRestaurants().get(i).setRestaurantName(restaurantName);
                        break;
                    case 2:
                        System.out.println("Enter the new restaurant NIT");
                        String nit = scan.nextLine();
                        platform.getRestaurants().get(i).setNit(nit);
                        break;
                    case 3:
                        System.out.println("Enter the new name of the restaurant manager");
                        String administratorName = scan.nextLine();
                        platform.getRestaurants().get(i).setAdministratorName(administratorName);
                        break;
                    case 4:
                        new Menu();
                        break;
                    default:
                        System.out.println("the option incorrect");
                }
                System.out.println("la info se ha cambiado");
            } else {
                System.out.println("The restaurant doest not exist");
            }
        }
    }

}
