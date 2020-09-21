package ui;

import model.CityRestaurants;

import java.util.Scanner;

public class RegisterRestaurants {
    Scanner scan = new Scanner(System.in);
    int opt ;

    CityRestaurants cityRestaurants = new CityRestaurants("","","");

    public RegisterRestaurants (){

    }

    public void registerRestaurants(){
        System.out.println("How many restaurants do you want to register?");
        opt = Integer.parseInt(scan.nextLine());

        for(int i = 0; i<opt; i++){

            System.out.println("Enter restaurant name");
            String restaurantsName = scan.nextLine();
            System.out.println("Enter NIT");
            String nitRestaurants = scan.nextLine();
            System.out.println("Enter administration name");
            String administrationsName = scan.nextLine();

            CityRestaurants restaurant = new CityRestaurants(restaurantsName,
                    nitRestaurants,
                    administrationsName
            );

            cityRestaurants.addRestaurants(restaurant);
            System.out.println("El restaurante se ha registrado de manera exictosa");
        }

        System.out.println("sus restaurantes son: ");
        for (int i = 0; i < cityRestaurants.getRestaurants().size() ; i++) {

        }

    }
}
