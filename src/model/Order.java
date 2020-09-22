package model;

import java.util.Date;

public class Order {
    private int orderCode;
    private int codeProduct;
    private int quantity;
    private Date date ;
    private Date hour;
    private String idClient;
    private String nitRestaurant;
    private String listProducts;


    public Order(int orderCode, int codeProduct, int quantity, Date date, Date hour, String idClient, String nitRestaurant, String listProducts) {
        this.orderCode = orderCode;
        this.codeProduct = codeProduct;
        this.quantity = quantity;
        this.date = date;
        this.hour = hour;
        this.idClient = idClient;
        this.nitRestaurant = nitRestaurant;
        this.listProducts = listProducts;
        date = new Date();

    }

    public int getOrderCode() {
        return orderCode = (int)(1000000 * Math.random());
    }

    public void setOrderCode(int orderCode) {
        this.orderCode = orderCode;
    }

    public int getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(int codeProduct) {
        this.codeProduct = codeProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getHour() {
        return hour;
    }

    public void setHour(Date hour) {
        this.hour = hour;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public String getNitRestaurant() {
        return nitRestaurant;
    }

    public void setNitRestaurant(String nitRestaurant) {
        this.nitRestaurant = nitRestaurant;
    }

    public String getListProducts() {
        return listProducts;
    }

    public void setListProducts(String listProducts) {
        this.listProducts = listProducts;
    }
}
