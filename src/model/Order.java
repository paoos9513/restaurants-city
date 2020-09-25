package model;

import java.util.Date;

public class Order {

    private final static String REQUESTED = "Requested";
    private final static String PROCESS = "Process";
    private final static String SENT = "Sent";

    private int orderCode;
    private int codeProduct;
    private int quantity;
    private Date date ;
    private Date hour;
    private String idClient;
    private String nitRestaurant;
    private String listProducts;
    private String state;



    public Order(int orderCode, int codeProduct, int quantity, Date date, Date hour, String idClient, String nitRestaurant, String listProducts, String state) {
        this.orderCode = orderCode;
        this.codeProduct = codeProduct;
        this.quantity = quantity;
        this.date = new Date();
        this.hour = hour;
        this.idClient = idClient;
        this.nitRestaurant = nitRestaurant;
        this.listProducts = listProducts;
        this.state = state;
        //date = new Date();

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

    public static String getREQUESTED() {
        return REQUESTED;
    }

    public static String getPROCESS() {
        return PROCESS;
    }

    public static String getSENT() {
        return SENT;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
