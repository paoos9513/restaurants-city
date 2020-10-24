package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    private Platform p;
    private Product pr;
    private void setupScenary1(){
        p = new Platform();
    }
    private void setupScenary2(){
        p = new Platform();

    }
    @Test
    public void testProduct() {
        setupScenary1();
        assertNotNull(p.getProducts());

    }

    @Test
    public void testAddProduct() {
        setupScenary2();
        String code = "3056";
        String productName = "crepes mixto";
        String productDescription = "Crepes con pollo, carne de rez y cordero";
        String restaurantNit = "12345";
        double productValue = 14300;
        pr = new Product(code,productName,productDescription,restaurantNit,productValue);
        p.addProducts(pr);
        assertNotNull(p.getProducts());
        assertEquals(code, pr.getProductCode());
        assertEquals(productName, pr.getProductName());
        assertEquals(productValue,pr.getProductValue());
    }


}