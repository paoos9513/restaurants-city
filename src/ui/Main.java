package ui;

import model.CityRestaurants;
import model.Platform;

public class Main {

    Platform platform;

    public Main() {
        platform = new Platform();
        new Menu();
    }

    public static void main(String[] args){
        new Main();
    }

}
