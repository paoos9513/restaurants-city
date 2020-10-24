package ui;

import model.CityRestaurants;
import model.Platform;
import java.util.Scanner;

public class RegisterRestaurants {

    Scanner scan = new Scanner(System.in);
    Platform platform;

    public RegisterRestaurants() {
        platform = Platform.getInstance();
    }

    public void registerRestaurants() {
        String exist = "";
        System.out.println("Enter NIT");
        String nitRestaurants = scan.nextLine();

        for (int i = 0; i < platform.getRestaurants().size(); i++) {
            if (nitRestaurants.equalsIgnoreCase(platform.getRestaurants().get(i).getNit())){
                exist = "The restaurant exist";
            }
        }

        if (exist.equalsIgnoreCase("The restaurant exist")){
            System.out.println(exist);
        }else {
            System.out.println("Enter restaurant name");
            String restaurantsName = scan.nextLine();
            System.out.println("Enter administration name");
            String administrationsName = scan.nextLine();

            CityRestaurants restaurant = new CityRestaurants(restaurantsName, nitRestaurants, administrationsName);

            platform.addRestaurants(restaurant);
            System.out.println("El restaurante se ha registrado");

        }

    }

}
