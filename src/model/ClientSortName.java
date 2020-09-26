package model;

import java.util.Comparator;

public class ClientSortName implements Comparator<Client> {


    @Override
    public int compare(Client o1, Client o2) {
            return o1.getClientName().compareToIgnoreCase(o2.getClientName());
    }
}
