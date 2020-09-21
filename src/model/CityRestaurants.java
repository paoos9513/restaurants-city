package model;

import java.util.ArrayList;
import java.util.List;

public class CityRestaurants {

    private String restaurantName;
    private String nit;
    private String administratorName;

    private  ArrayList<CityRestaurants> restaurants = new ArrayList<>();
    private ArrayList<Client> clients = new ArrayList<>();
    private ArrayList<Product> products = new ArrayList<>();

    public CityRestaurants(String restaurantName, String nit, String administratorName) {
        this.restaurantName = restaurantName;
        this.nit = nit;
        this.administratorName = administratorName;
    }

    public void addRestaurants( CityRestaurants restaurants){
        this.restaurants.add(restaurants);
    }


    public void initRestaurants(){
        restaurants.add( new CityRestaurants( "Crepes&Crepes",
                "12345",
                "Jhon Osorio" )
        );

        restaurants.add( new CityRestaurants( "Helados Juanito",
                "1234567",
                "Juan Buitrago" )
        );

        restaurants.add( new CityRestaurants( "El Sirio",
                "1234598",
                "Marwar Malaver" )
        );

    }
    public void addProducts( Product products){
        this.products.add(products);
    }

    public void addClients( Client client){
        this.clients.add(client);
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public String getNit() {
        return nit;
    }

    public String getAdministratorName() {
        return administratorName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public void setAdministratorName(String administratorName) {
        this.administratorName = administratorName;
    }

    public ArrayList<CityRestaurants> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(ArrayList<CityRestaurants> restaurants) {
        this.restaurants = restaurants;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}

