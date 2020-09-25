package ui;

import model.*;

public class Show {
    Platform platform;

    public Show(){
        platform = Platform.getInstance();
    }

    public void showRestaurants(){

        for (int i = 0; i < platform.getRestaurants().size() ; i++) {
            CityRestaurants restaurant = platform.getRestaurants().get(i);
            System.out.println("Resturante Numero: " + i);
            System.out.println("nombre de restaurante: " + restaurant.getRestaurantName());
            System.out.println("NIT" + restaurant.getNit());
            System.out.println("nombre de ADMINISTRADOR: " + restaurant.getAdministratorName());

        }
    }
    public void showProducts(){
        for (int i = 0; i < platform.getProducts().size() ; i++) {
            Product product = platform.getProducts().get(i);
            System.out.println("Resturante Numero: " + i);
            System.out.println("codugo de producto es : " + product.getProductCode());
            System.out.println("el nombre del producto es: " + product.getProductName());
            System.out.println("la descripcion del producto es : " + product.getProductDescription());
            System.out.println("el nit del restaurante es : " + product.getRestaurantNit());
            System.out.println("el precio del producto es : " + product.getProductValue());

        }
    }

    public void showClients(){
        for (int i = 0; i < platform.getClients().size() ; i++) {
            Client client = platform.getClients().get(i);
            System.out.println("Resturante Numero: " + i);
            System.out.println("codigo de producto es : " + client.getFullClientName());
            System.out.println("el nombre del producto es: " + client.getIdType());
            System.out.println("la descripcion del producto es : " + client.getNumberId());
            System.out.println("el nit del restaurante es : " + client.getTelephone());
            System.out.println("el precio del producto es : " + client.getAddress());

        }
    }

    public void showOrder(){
        for (int i = 0; i < platform.getOrders().size() ; i++) {
            Order order = platform.getOrders().get(i);
            System.out.println("Resturante Numero: " + i);
            System.out.println("codigo de order es :" + order.getOrderCode());
            System.out.println("codigo de producto es  :" + order.getCodeProduct());
            System.out.println("La cantidad es : " + order.getQuantity());
            System.out.println("Fecha solicitud: " + order.getDate());
            System.out.println("hora solicitud: " + order.getDate());
            System.out.println("el id cliente es : " + order.getIdClient());
            System.out.println("el nit de restaurante es : " + order.getNitRestaurant());
            System.out.println("Lista de Productos : " + order.getListProducts());
            System.out.println("Estado del pedido : " + order.getState() );
        }
    }
}
