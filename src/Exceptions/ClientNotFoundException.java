package Exceptions;

public class ClientNotFoundException extends Exception {

    public ClientNotFoundException(String nameClient) {

        System.out.println("the client " + nameClient + " was not found");
    }
}
