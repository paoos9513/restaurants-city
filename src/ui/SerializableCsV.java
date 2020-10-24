package ui;

import model.CityRestaurants;
import model.Client;
import model.Platform;
import model.Product;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializableCsV {
    Platform platform;

    public SerializableCsV() {
        platform = Platform.getInstance();

    }

    public void restaurantsCSV() {
        Path filePath = Paths.get("./doc/restaurants.csv");
        try {
            BufferedReader br = Files.newBufferedReader(filePath);
            String linea;
            int count = 0;
            while ((linea = br.readLine()) != null) {
                if (count != 0) {
                    String[] LineDate = linea.split(",");
                    String restaurantName = LineDate[0];
                    String nit = LineDate[1];
                    String administratorName = LineDate[2];

                    CityRestaurants restaurant1 = new CityRestaurants(restaurantName, nit, administratorName);
                    platform.addRestaurants(restaurant1);
                }
                count++;
            }

        } catch (Exception a) {
            a.getMessage();
        }
    }

    public void productsCSV() {
        Path filePath = Paths.get("./doc/products.csv");
        try {
            BufferedReader br = Files.newBufferedReader(filePath);
            String linea;
            int count = 0;
            while ((linea = br.readLine()) != null) {
                if (count != 0) {
                    String[] LineDate = linea.split(",");
                    String productCode = LineDate[0];
                    String productName = LineDate[1];
                    String productDescription = LineDate[2];
                    String restaurantNit = LineDate[3];
                    double productValue = Double.parseDouble(LineDate[4].trim());
                    Product product1 = new Product(productCode, productName, productDescription, restaurantNit, productValue);
                    platform.addProducts(product1);
                }
                count++;
            }
        } catch (Exception a) {
            a.getMessage();
        }
    }


    public void clientsCSV() {
        Path filePath = Paths.get("./doc/clients.csv");
        try {
            BufferedReader br = Files.newBufferedReader(filePath);
            String linea;
            int count = 0;
            while ((linea = br.readLine()) != null) {
                if (count != 0) {
                    String[] LineDate = linea.split(",");
                    String clientName = LineDate[0];
                    String clientLastName = LineDate[1];
                    String idType = LineDate[2];
                    String numberId = LineDate[3];
                    String telephone = LineDate[4].trim();
                    String address = LineDate[5];
                    Client client1 = new Client(clientName, clientLastName, idType, numberId, telephone, address);
                    platform.addClients(client1);
                }
                count++;
            }
        } catch (Exception a) {
            a.getMessage();
        }
    }

}
