package ui;


import model.Platform;
import model.Product;

import java.util.Scanner;

public class RegisterProducts {
    Scanner scan = new Scanner(System.in);
    Platform platform;

    public RegisterProducts() {
        platform = Platform.getInstance();
    }

    public void registerProducts() {
        String exist = "";
        System.out.println("Enter product code");
        String productCode = scan.nextLine();

        for (int i = 0; i < platform.getProducts().size(); i++) {
            if (productCode.equalsIgnoreCase(platform.getProducts().get(i).getProductCode())) {
                exist = "The product exist";
            }

        }
        if (exist.equalsIgnoreCase("The product exist")) {
            System.out.println(exist);
        } else {
            System.out.println("Enter product name");
            String productName = scan.nextLine();
            System.out.println("Enter product description");
            String productDescription = scan.nextLine();
            System.out.println("Enter the NIT of the restaurant to which the product belong");
            String restaurantNit = scan.nextLine();
            System.out.println("Enter product value");
            double productValue = Double.parseDouble(scan.nextLine());

            Product product = new Product(productCode, productName, productDescription, restaurantNit, productValue);

            platform.addProducts(product);
            System.out.println("El producto se ha registrado de manera exictosa");

        }
    }
}
