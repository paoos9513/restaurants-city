package model;

import Exceptions.ExceptionOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Platform {

    private ArrayList<CityRestaurants> restaurants = new ArrayList<>();
    private ArrayList<Client> clients = new ArrayList<>();
    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Order> orders = new ArrayList<>();

    //Singleton SIRVE PARA RETORNARME LO QUE CONTIENE EN TODAS LAS CLASES o sea me da una instancia unica para todas las clases
    private static Platform platform;

    public Platform() {
        initRestaurants();
        initProducts();
        initClients();

    }

    //metodo para cla
    public static Platform getInstance() {
        if (platform == null) {
            platform = new Platform();
        }
        return platform;
    }

    public void initRestaurants() {
        restaurants.add(new CityRestaurants("Crepes&Crepes", "12345", "Jhon Osorio"));
        restaurants.add(new CityRestaurants("Helados Juanito", "1234567", "Juan Buitrago"));
        restaurants.add(new CityRestaurants("El Sirio", "1234598", "Marwar Malaver"));
    }

    public void addRestaurants(CityRestaurants restaurant) {
        this.restaurants.add(restaurant);
    }

    public void initProducts() {
        products.add(new Product("1232", "Hamburger", "Hamburguesa sencilla con papas a la francesa", "123456789", 14500));
        products.add(new Product("12332", "HotDog", "Perro caliente con gaseosa", "1232322", 12000));
        products.add(new Product("3056", "Crepes Mixto", "Crepes con pollo, carne de rez y cordero", "12345", 14600));
    }

    public void addProducts(Product products) {
        this.products.add(products);
    }

    public void initClients() {
        clients.add(new Client("Paola Andrea ", "Osorio Holguin", "CC", "1234567", "3142332222", "Carrera 119 # 49 - 51"));
        clients.add(new Client("Pablo Emilio", "Rendon Cardona", "CC", "1234567", "3142332222", "Carrera 119 # 49 - 51"));
        clients.add(new Client("Jhon Albeiro", "Osorio Holguin", "CC", "1234500", "4321212485", "Carrera 60 # 25E - 34"));
        clients.add(new Client("Anderson Arturo ", "Rueda Guevara", "CC", "123452345", "123456789", "Carrera 66 # 65 - 90"));
    }

    public void addClients(Client client) {
        this.clients.add(client);
    }

    public boolean addProductToRestaurant(String restaurantNit, Order order) throws ExceptionOrder {

        boolean search = false;
        int cont = 0;
        if (order != null) {

            for (int i = 0; i < getProducts().size(); i++) {
                if (getProducts().get(i).getRestaurantNit().equals(order.getNitRestaurant())) {
                    cont++;
                } else {
                    throw new ExceptionOrder(getProducts().get(i).getProductName(),
                            getProducts().get(i).getProductName());
                }
            }
            if (products == cont) {
                verify = true;
            }
        }
        return verify;
        for (int i = 0; i < restaurants.size(); i++) {
            if (restaurants.get(i).getNit().equals(restaurantNit)) {
                restaurants.get(i).addProducts(product);
            }

            System.out.println("Pedido se agrego satisfactoriamente a restaurante");
        }

    }

    public void addOrders(Order order) {
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

    public ArrayList<CityRestaurants> getRestaurants() {
        return restaurants;
    }

    public void sortClients() {
        Comparator<Client> var;
        var = new Comparator<Client>() {
            public int compare(Client n1, Client n2) {
                String c1 = n1.getClientName();
                String c2 = n2.getClientName();
                int result1;
                result1 = (c2.compareTo(c1));
                return result1;
            }
        };
        Collections.sort(clients, var);
    }

}