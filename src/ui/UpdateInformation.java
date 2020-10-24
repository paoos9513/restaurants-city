package ui;

import model.Platform;

import java.util.Scanner;

public class UpdateInformation {

    int opt;
    Scanner scan = new Scanner(System.in);
    Platform platform;
    String update = "";
    public UpdateInformation() {
        platform = Platform.getInstance();
    }

    //registra la actualizacion de un restaurante

    public void updateRestaurant() {

        System.out.println("Enter the NIT of the restaurant you want to update");
        String nitS = scan.nextLine();

        for (int i = 0; i < platform.getRestaurants().size(); i++) {
            update = "";
            if (nitS.equalsIgnoreCase(platform.getRestaurants().get(i).getNit())) {
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
                update = "The restaurant not exist";
            }
        }
        if (update.equalsIgnoreCase("The restaurant not exist")){
            System.out.println(update);
        }

    }

    //registra la actualizacion de un producto
    public void updateProduct() {

        System.out.println("Enter the code of the product you want to update");
        String codeSearch = scan.nextLine();

        for (int i = 0; i < platform.getProducts().size(); i++) {
            update = "";
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
                update = "The product doest not exist";
            }

        }
        if (update.equalsIgnoreCase("The product doest not exist")){
            System.out.println(update);
        }
    }

    //registra la actualizacion de un cliente
    public void updateClient() {

        System.out.println("Enter the identification of the client you want to update");
        String idSearch = scan.nextLine();

        for (int i = 0; i < platform.getClients().size(); i++) {
            update ="";
            if (idSearch.equals(platform.getClients().get(i).getNumberId())) {

                System.out.println(" ");
                System.out.println("----------------UPDATE----------------");
                System.out.println("Select the option you want to update \n");
                System.out.println("(1).Client name \n" +
                        "(2).Document type \n" +
                        "(3).Document number \n" +
                        "(4).Telephone number \n" +
                        "(5).Address\n"

                );
                opt = Integer.parseInt(scan.nextLine());
                switch (opt) {
                    case 1:
                        System.out.println("Enter the new customer's full name");
                        String fullClientName = scan.nextLine();
                        platform.getClients().get(i).setClientName(fullClientName);
                        break;
                    case 2:
                        System.out.println("Enter new document type");
                        String idType = scan.nextLine();
                        platform.getClients().get(i).setIdType(idType);
                        break;
                    case 3:
                        System.out.println("Enter the new document number");
                        String numberId = scan.nextLine();
                        platform.getClients().get(i).setNumberId(numberId);
                        break;
                    case 4:
                        System.out.println("Enter the new telephone number");
                        String telephone = scan.nextLine();
                        platform.getClients().get(i).setTelephone(telephone);
                        break;
                    case 5:
                        System.out.println("Enter the new address");
                        String address = scan.nextLine();
                        platform.getClients().get(i).setAddress(address);
                        break;
                    default:
                        System.out.println("the option incorrect");
                }
                System.out.println("se ha actualizado de forma exitosa ");
            } else {

                update = "The Client doest not exist";
            }
        }
        if (update.equalsIgnoreCase("The Client doest not exist")){
            System.out.println(update);
        }
    }

    // registra la actualizacion de una orden //arreglar el estado de la orden !!!!!!!!!!!!!!!!!!!!!!!!

    public void updateOrder() {

        System.out.println("Enter the code of the order you want to update");
        String codeOrderSearch = scan.nextLine();

        for (int i = 0; i < platform.getOrders().size(); i++) {
            update = "";
            if (codeOrderSearch.equals(platform.getOrders().get(i).getOrderCode())) {

                System.out.println(" ");
                System.out.println("----------------UPDATE----------------");
                System.out.println("Select the option you want to update \n");
                System.out.println("(1).Product code \n" +
                        "(2).The amount \n" +
                        "(3).Customer document \n" +
                        "(4).NIT of the restaurant that the order belong to \n" +
                        "(5).Order status \n"

                );
                opt = Integer.parseInt(scan.nextLine());
                switch (opt) {
                    case 1:
                        System.out.println("Enter new product code");
                        String codeProduct = scan.nextLine();
                        platform.getOrders().get(i).setCodeProduct(codeProduct);
                        break;
                    case 2:
                        System.out.println("Enter the new amount");
                        int quantity = Integer.parseInt(scan.nextLine());
                        platform.getOrders().get(i).setQuantity(quantity);
                        break;
                    case 3:
                        System.out.println("Enter the customer's document number");
                        String idClient = scan.nextLine();
                        platform.getOrders().get(i).setIdClient(idClient);
                        break;
                    case 4:
                        System.out.println("Enter the new NIT of the restaurant that the order belong to");
                        String nitRestaurant = scan.nextLine();
                        platform.getOrders().get(i).setNitRestaurant(nitRestaurant);
                        break;
                    case 5:
                        System.out.println("Enter the new order status");
                        System.out.println("(1).PROCESS");
                        System.out.println("(2).SENT");
                        System.out.println("(3).DELIVERED");
                        int stateOpt = Integer.parseInt(scan.nextLine());
                        String state = "";

                        if (stateOpt == 1) {
                            state = "Process";
                        } else if (stateOpt == 2) {
                            state = "Sent";
                        } else if (stateOpt == 3) {
                            state = "Delivered";
                        } else {
                            System.out.println("The option incorrect");
                        }
                        platform.getOrders().get(i).setState(state);

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
