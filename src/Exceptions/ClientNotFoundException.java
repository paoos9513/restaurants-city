package Exceptions;

public class ClientNotFoundException extends Throwable {

    public ClientNotFoundException(String nameClient) {

        System.out.println("NOMBRE NO ENCONTRADO");
    }
}
