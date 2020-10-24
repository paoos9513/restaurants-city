package model;

import java.util.Comparator;

public class NameComparator implements Comparator<CityRestaurants> {
    @Override
    public int compare(CityRestaurants o1, CityRestaurants o2) {
        int comp;
        String n1 = o1.getRestaurantName();
        String n2 = o2.getRestaurantName();

        comp = n1.compareTo(n2);
        return comp;
    }
}
