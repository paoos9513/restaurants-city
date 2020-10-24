package ui;

import Exceptions.ClientNotFoundException;
import model.Platform;
import java.util.Scanner;

public class SearchClient {
    Scanner scan = new Scanner(System.in);
    Platform platform;
    public SearchClient(){
        platform = Platform.getInstance();
        searchClient1();
    }

    public void searchClient1(){
        System.out.println("Enter the client name to search");
        String nameClient = scan.nextLine();

        try {
            platform.searchClientLog(nameClient);
        } catch (ClientNotFoundException a) {
            a.getMessage();
        }
    }

}
