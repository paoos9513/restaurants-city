package model;

public class Product {
    private int code;
    private String productName;
    private String productDescription;
    private String restaurantNit;
    private double productValue;

    public Product(int code, String productName, String productDescription, String restaurantNit, double productValue) {
        this.code = code;
        this.productName = productName;
        this.productDescription = productDescription;
        this.restaurantNit = restaurantNit;
        this.productValue = productValue;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getRestaurantNit() {
        return restaurantNit;
    }

    public void setRestaurantNit(String restaurantNit) {
        this.restaurantNit = restaurantNit;
    }

    public double getProductValue() {
        return productValue;
    }

    public void setProductValue(double productValue) {
        this.productValue = productValue;
    }
}
