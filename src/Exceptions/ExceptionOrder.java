package Exceptions;

public class ExceptionOrder extends Exception {

    public ExceptionOrder(String productName, String restaurant) {
        System.out.println("The product " + productName + " does not belong to the Restaurant " + restaurant );
    }
}
