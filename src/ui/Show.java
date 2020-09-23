package ui;

import model.CityRestaurants;
import model.Client;
import model.Order;
import model.Product;



public class Show {
    CityRestaurants cityRestaurants ;

    public Show(){
        cityRestaurants = new CityRestaurants("","","");

    }

    public void showRestaurants(){
        cityRestaurants.initRestaurants();
        for (int i = 0; i < cityRestaurants.getRestaurants().size() ; i++) {
            CityRestaurants restaurant = cityRestaurants.getRestaurants().get(i);
            System.out.println("Resturante Numero: " + i);
            System.out.println("nombre de restaurante: " + restaurant.getRestaurantName());
            System.out.println("NIT" + restaurant.getNit());
            System.out.println("nombre de ADMINISTRADOR: " + restaurant.getAdministratorName());

        }
    }
    public void showProducts(){
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

    public void showClients(){
        for (int i = 0; i < cityRestaurants.getClients().size() ; i++) {
            Client client = cityRestaurants.getClients().get(i);
            System.out.println("Resturante Numero: " + i);
            System.out.println("codigo de producto es : " + client.getFullClientName());
            System.out.println("el nombre del producto es: " + client.getIdType());
            System.out.println("la descripcion del producto es : " + client.getNumberId());
            System.out.println("el nit del restaurante es : " + client.getTelephone());
            System.out.println("el precio del producto es : " + client.getAddress());

        }
    }

    public void showOrder(){
        for (int i = 0; i < cityRestaurants.getOrders().size() ; i++) {
            Order order = cityRestaurants.getOrders().get(i);
            System.out.println("Resturante Numero: " + i);
            System.out.println("codigo de order es :" + order.getOrderCode());
            System.out.println("codigo de producto es  :" + order.getCodeProduct());
            System.out.println("La cantidad es : " + order.getQuantity());
            System.out.println("Fecha solicitud: " + order.getDate());
            System.out.println("hora solicitud: " + order.getDate());
            System.out.println("el id cliente es : " + order.getIdClient());
            System.out.println("el nit de restaurante es : " + order.getNitRestaurant());
            System.out.println("Lista de Productos : " + order.getListProducts());

        }
    }
}
