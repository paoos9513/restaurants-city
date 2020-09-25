package ui;

import controller.CityRestaurantsController;
import model.CityRestaurants;
import model.Order;
import model.Platform;
import model.Product;
import java.util.Scanner;

public class UpdateInformation {

    Scanner scan = new Scanner(System.in);
    Platform platform;
    CityRestaurantsController cityRestaurantsController;
    CityRestaurants cityRestaurants;
    Product product;
    Order order;

    public UpdateInformation(){
        platform = Platform.getInstance();
    }
    // NO FUNCIONA, SE SALE EN LA LINEA 34 DONDE ESTA EL SEGUNDO IF
    public void setCityRestaurants(){

        System.out.println("Enter the NIT of the restaurant you want to update");
        String nit = scan.nextLine();

        System.out.println("Enter the new restaurant name");
        String restaurantName = scan.nextLine();

        System.out.println("Enter the new name of the restaurant manager");
        String administratorName = scan.nextLine();

        if((nit != null)&(nit != " ")){
            for (int i = 0; i < platform.getRestaurants().size(); i++) {
                CityRestaurants restaurant = platform.getRestaurants().get(i);
                if(cityRestaurants.getNit().equalsIgnoreCase(restaurant.getNit())){
                    restaurant.setAdministratorName(administratorName);
                    restaurant.setRestaurantName(restaurantName);
                }
            }
        }
        System.out.println("la info se ha cambiado");
    }
    

}
