package ui;

import model.CityRestaurants;
import model.Platform;

import java.io.IOException;
import java.util.Scanner;

public class RegisterRestaurants {

    Scanner scan = new Scanner(System.in);
    int opt ;
    Platform platform;

    public RegisterRestaurants (){
        platform = Platform.getInstance();
    }

    public void registerRestaurants(){

        System.out.println("How many restaurants do you want to register?");
        opt = Integer.parseInt(scan.nextLine());

        for(int i = 0; i<opt; i++){

            System.out.println("Enter NIT");
            String nitRestaurants = scan.nextLine();
            System.out.println("Enter restaurant name");
            String restaurantsName = scan.nextLine();
            System.out.println("Enter administration name");
            String administrationsName = scan.nextLine();

            CityRestaurants restaurant = new CityRestaurants(restaurantsName,
                    nitRestaurants,
                    administrationsName
            );

            platform.addRestaurants(restaurant);
            System.out.println("El restaurante se ha registrado de manera exictosa");
        }

        System.out.println("sus restaurantes son: ");

        //PRUEBA PRUEBA DE FUNCION

        for (int i = 0; i < platform.getRestaurants().size() ; i++) {
            CityRestaurants restaurant = platform.getRestaurants().get(i);
            System.out.println("Resturante Numero: " + i);
            System.out.println("nombre de restaurante: " + restaurant.getRestaurantName());
            System.out.println("NIT" + restaurant.getNit());
            System.out.println("nombre de ADMINISTRADOR: " + restaurant.getAdministratorName());

        }

    }

}
