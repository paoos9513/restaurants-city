package model;

import java.util.ArrayList;

public class Platform {

    private ArrayList<CityRestaurants> restaurants = new ArrayList<>();
    private ArrayList<Client> clients = new ArrayList<>();
    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Order> orders = new ArrayList<>();

    //Singleton SIRVE PARA RETORNARME LO QUE CONTIENE EN TODAS LAS CLASES o sea me da una instancia unica para todas las clases
    private static Platform platform;

    public Platform(){
        initRestaurants();
    }

    public static Platform getInstance(){
        if(platform == null){
            platform = new Platform();
        }
        return  platform;
    }


    public void initRestaurants(){

        restaurants.add(new CityRestaurants( "Crepes&Crepes",
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

    public void addRestaurants( CityRestaurants restaurant){
        this.restaurants.add(restaurant);
    }

    public ArrayList<CityRestaurants> getRestaurants() {
        return restaurants;
    }

    public void addProducts( Product products){
        this.products.add(products);
    }

    public void addClients( Client client){
        this.clients.add(client);
    }

    public void addOrders( Order order){
        this.orders.add(order);
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

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

}
