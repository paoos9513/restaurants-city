package ui;

import model.CityRestaurants;
import model.Product;

import java.util.Scanner;

public class RegisterProducts {
    Scanner scan = new Scanner(System.in);
    int opt ;

    CityRestaurants cityRestaurants = new CityRestaurants("","","");

    public RegisterProducts(){

    }

    public void registerProducts(){

        System.out.println("How many restaurants do you want to register?");
        opt = Integer.parseInt(scan.nextLine());

        for(int i = 0; i<opt; i++){

            System.out.println("Enter product code");
            int productCode = Integer.parseInt(scan.nextLine());
            System.out.println("Enter product name");
            String productName = scan.nextLine();
            System.out.println("Enter product description");
            String productDescription = scan.nextLine();
            System.out.println("Enter the NIT of the restaurant to which the product belong");
            String restaurantNit = scan.nextLine();
            System.out.println("Enter product value");
            double productValue = Double.parseDouble(scan.nextLine());

            Product product = new Product(productCode,
                    productName,
                    productDescription,
                    restaurantNit,
                    productValue
            );

            cityRestaurants.addProducts(product);
            System.out.println("El producto se ha registrado de manera exictosa");
        }
        //Prueba prueba
        for (int i = 0; i < cityRestaurants.getProducts().size() ; i++) {
            Product product = cityRestaurants.getProducts().get(i);
            System.out.println("Resturante Numero: " + i);
            System.out.println("codugo de producto es : " + product.getProductCode());
            System.out.println("el nombre del producto es: " + product.getProductName());
            System.out.println("la descripcion del producto es : " + product.getProductDescription());
            System.out.println("el nit del restaurante es : " + product.getRestaurantNit());
            System.out.println("el precio del producto es : " + product.getProductValue());

        }
    }
}
