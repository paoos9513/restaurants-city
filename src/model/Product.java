package model;

import java.util.ArrayList;

public class Product {
    private int ProductCode;
    private String productName;
    private String productDescription;
    private String restaurantNit;
    private double productValue;
    ArrayList<Product> products = new ArrayList<>();

    public Product(int code, String productName, String productDescription, String restaurantNit, double productValue) {
        this.ProductCode = code;
        this.productName = productName;
        this.productDescription = productDescription;
        this.restaurantNit = restaurantNit;
        this.productValue = productValue;
    }

    public int getProductCode() {
        return ProductCode;
    }

    public void setProductCode(int productCode) {
        this.ProductCode = productCode;
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
