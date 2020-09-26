package ui;

import model.CityRestaurants;
import model.Order;
import model.Platform;
import model.Product;

import java.util.Scanner;

public class UpdateInformation {

    int opt;
    Scanner scan = new Scanner(System.in);
    Platform platform;

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
                    default:
                        System.out.println("the option incorrect");
                }
                System.out.println("la info se ha cambiado");
            } else {
                System.out.println("The restaurant doest not exist");
            }
        }

    }

    //registra la actualizacion de un producto
    public void updateProduct() {

        System.out.println("Enter the code of the product you want to update");
        String codeSearch = scan.nextLine();

        for (int i = 0; i < platform.getProducts().size(); i++) {

            if (codeSearch.equals(platform.getProducts().get(i).getProductCode())) {

                System.out.println(" ");
                System.out.println("----------------UPDATE----------------");
                System.out.println("Select the option you want to update \n");
                System.out.println("(1).Product name \n" +
                        "(2).Product description \n" +
                        "(3).NIT of the restaurant to which the product belong \n" +
                        "(4).Product value \n"
                );
                opt = Integer.parseInt(scan.nextLine());
                switch (opt) {
                    case 1:
                        System.out.println("Enter new product name");
                        String productName = scan.nextLine();
                        platform.getProducts().get(i).setProductName(productName);
                        break;
                    case 2:
                        System.out.println("Enter new product description");
                        String productDescription = scan.nextLine();
                        platform.getProducts().get(i).setProductDescription(productDescription);
                        break;
                    case 3:
                        System.out.println("Enter the new NIT of the restaurant to which the product belong");
                        String restaurantNit = scan.nextLine();
                        platform.getProducts().get(i).setRestaurantNit(restaurantNit);
                        break;
                    case 4:
                        System.out.println("Enter new product value");
                        double productValue = Double.parseDouble(scan.nextLine());
                        platform.getProducts().get(i).setProductValue(productValue);
                        break;
                    default:
                        System.out.println("the option incorrect");
                }
                System.out.println("se ha actualizado de forma exictosa ");
            } else {
                System.out.println("The product doest not exist");
            }

        }
    }

    //registra la actualizacion de un cliente
    public void updateClient() {

        System.out.println("Enter the identification of the client you want to update");
        String idSearch = scan.nextLine();

        for (int i = 0; i < platform.getClients().size(); i++) {

            if (idSearch.equals(platform.getClients().get(i).getNumberId())) {

                System.out.println(" ");
                System.out.println("----------------UPDATE----------------");
                System.out.println("Select the option you want to update \n");
                System.out.println("(1).Client name \n" +
                        "(2).Document type \n" +
                        "(3).Document number \n" +
                        "(4).Telephone number \n" +
                        "(4).Address\n"

                );
                opt = Integer.parseInt(scan.nextLine());
                switch (opt) {
                    case 1:
                        System.out.println("Enter the new customer's full name");
                        String fullClientName = scan.nextLine();
                        platform.getClients().get(i).setFullClientName(fullClientName);
                        break;
                    case 2:
                        System.out.println("Enter new document type");
                        String idType = scan.nextLine();
                        platform.getClients().get(i).setIdType(idType);
                        break;
                    case 3:
                        System.out.println("Enter the new telephone number");
                        String telephone = scan.nextLine();
                        platform.getClients().get(i).setTelephone(telephone);
                        break;
                    case 4:
                        System.out.println("Enter the new address");
                        String address = scan.nextLine();
                        platform.getClients().get(i).setAddress(address);
                        break;
                    default:
                        System.out.println("the option incorrect");
                }
                System.out.println("se ha actualizado de forma exitosa ");
            } else {

                System.out.println("The Client doest not exist");
            }


        }
    }

    // registra la actualizacion de una orden

    public void updateOrder() {

        System.out.println("Enter the code of the order you want to update");
        int codeOrderSearch = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < platform.getClients().size(); i++) {

            if (codeOrderSearch == (platform.getOrders().get(i).getOrderCode())) {

                System.out.println(" ");
                System.out.println("----------------UPDATE----------------");
                System.out.println("Select the option you want to update \n");
                System.out.println("(1).Client name \n" +
                        "(2).Document type \n" +
                        "(3).Document number \n" +
                        "(4).Telephone number \n" +
                        "(4).Address\n"

                );
                opt = Integer.parseInt(scan.nextLine());
                switch (opt) {
                    case 1:
                        System.out.println("Enter the new customer's full name");
                        String fullClientName = scan.nextLine();
                        platform.getClients().get(i).setFullClientName(fullClientName);
                        break;
                    case 2:
                        System.out.println("Enter new document type");
                        String idType = scan.nextLine();
                        platform.getClients().get(i).setIdType(idType);
                        break;
                    case 3:
                        System.out.println("Enter the new telephone number");
                        String telephone = scan.nextLine();
                        platform.getClients().get(i).setTelephone(telephone);
                        break;
                    case 4:
                        System.out.println("Enter the new address");
                        String address = scan.nextLine();
                        platform.getClients().get(i).setAddress(address);
                        break;
                    default:
                        System.out.println("the option incorrect");
                }
                System.out.println("se ha actualizado de forma exitosa ");
            } else {

                System.out.println("The Client doest not exist");
            }


        }
    }

}
