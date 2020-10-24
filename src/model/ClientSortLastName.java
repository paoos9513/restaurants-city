package model;

import java.util.Comparator;

public class ClientSortLastName implements Comparator<Client> {
    @Override
    public int compare(Client o1, Client o2) {
        return (o1.getClientLastName().compareToIgnoreCase(o2.getClientName()))==0?
                o2.getClientName().compareToIgnoreCase(o1.getClientName()):o1.getClientName().compareToIgnoreCase(o2.getClientName());
    }
}
