package model;

import java.util.Date;

public class Order {


    private String orderCode;
    private String codeProduct;
    private int quantity;
    private Date date;
    private Date hour;
    private String idClient;
    private String nitRestaurant;
    private String listProducts;
    private String state;


    public Order(String orderCode, String codeProduct, int quantity, Date date, Date hour, String idClient, String nitRestaurant, String listProducts, String state) {
        this.orderCode = orderCode;
        this.codeProduct = codeProduct;
        this.quantity = quantity;
        this.date = new Date();
        this.hour = hour;
        this.idClient = idClient;
        this.nitRestaurant = nitRestaurant;
        this.listProducts = listProducts;
        this.state = state;

    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(String codeProduct) {
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String toString() {
        return "Code Order : "+ orderCode + ", Code : " + codeProduct + ", Quantity : "+ quantity + ", Date : "+ date + ", ID client : " + idClient + ", NIT restaurant : " + nitRestaurant;
    }
}
