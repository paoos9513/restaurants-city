package ui;

import model.Platform;
import java.io.IOException;

public class Main {

    Platform platform;

    public Main() throws IOException {
        platform = new Platform();
        new Menu();
    }

    public static void main(String[] args) throws IOException {
        new Main();
    }

}
