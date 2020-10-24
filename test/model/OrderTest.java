package model;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    private Order o;
    private Platform p;
    private void setupScenary1(){
        p = new Platform();
    }

    @Test
    public void testOrder() {
        setupScenary1();

        String orderCode = "12352221";
        String codeProduct = "3056";
        int quantity = 23000;
        Date date = new Date();
        Date hour = new Date();
        String idClient = "1234567";
        String nitRestaurant = "1234567";
        String listProducts = "";
        String state = "Sent";
        o = new Order(orderCode,codeProduct,quantity,date,hour,idClient,nitRestaurant,listProducts,state);
        assertEquals(nitRestaurant, p.getRestaurants().get(1).getNit(), "se encontro");
        assertEquals(codeProduct, p.getProducts().get(2).getProductCode(), "se encontro");
        assertEquals(idClient, p.getClients().get(1).getNumberId(), "se encontro");

    }

}