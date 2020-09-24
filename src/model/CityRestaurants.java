package model;


public class CityRestaurants {

    private String restaurantName;
    private String nit;
    private String administratorName;

    public CityRestaurants(String restaurantName, String nit, String administratorName) {
        this.restaurantName = restaurantName;
        this.nit = nit;
        this.administratorName = administratorName;

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


}


