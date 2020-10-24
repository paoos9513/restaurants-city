package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlatformTest {
    private Platform p;
    private CityRestaurants r;
    private void setupScenary1(){
        p = new Platform();
    }

    @Test
    public void testPlatform() {
        setupScenary1();
        assertNotNull(p.getRestaurants());
        assertNotNull(p.getProducts());

    }

    private void setupScenary2(){
        p = new Platform();

    }

    @Test
    public void testAddRestaurant() {
        setupScenary2();
        String name = "Food";
        String nit = "423112212";
        String nameAdministration = "Albert Orge";
        r = new CityRestaurants(name,nit,nameAdministration);
        p.addRestaurants(r);
        assertNotNull(p.getRestaurants());
        assertEquals(name, r.getRestaurantName());
        assertEquals(nit, r.getNit());
        assertEquals(nameAdministration,r.getAdministratorName());

    }




}