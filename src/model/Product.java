package model;

public class Product {
    private String productCode;
    private String productName;
    private String productDescription;
    private String restaurantNit;
    private double productValue;


    public Product(String code, String productName, String productDescription, String restaurantNit, double productValue) {
        this.productCode = code;
        this.productName = productName;
        this.productDescription = productDescription;
        this.restaurantNit = restaurantNit;
        this.productValue = productValue;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
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

    @Override
    public String toString() {
        return "Name : "+ productName + ", Code : " + productCode + ", Description : "+ productDescription + ", Price : "+ productValue + ", NIT restaurant : " + restaurantNit;
    }
}
