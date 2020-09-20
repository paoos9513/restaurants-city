package ui;

import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);
    int opt;

    public Menu (){
        show();
        menu();
    }
    public void show(){
        System.out.println(" ");
        System.out.println("************************************");
        System.out.println(" WELCOME TO THE DOMICILES PLATFORM ");
        System.out.println("************************************");
        menu();
        show();
    }

    public void menu(){

        System.out.println("Select the option you want");
        System.out.println("----------------MENU----------------");
        System.out.println(" ");
        System.out.println("(1).Register Restaurant \n" +
                "(2).Register Product \n" +
                "(3).Register Client \n" +
                "(4).Register Order \n" +
                "(5).Order Status \n" +
                "(6).Update Restaurant Data \n" +
                "(7).Update Product Data \n" +
                "(8).Update Client Data \n" +
                "(9).Update Order Data \n" +
                "(10).Save Information \n" +
                "(11).Save Information \n" +
                "(12).Print \n" +
                "(13).Import \n" +
                "(14).Closed \n"
        );
        opt = Integer.parseInt(scan.nextLine());

        switch (opt){

            case 1:

                break;
            case 2:

                break;

            case 3:
                break;

            case 4:

                break;

            case 5:

                break;

            case 6:

                break;

            case 7:
                break;

            case 8:
                break;

            case 9:

                break;

            case 10:

                break;

            case 11:

                break;

            case 12:

                break;

            case 13:
                scan.close();
                break;
            default:
                System.out.println("The option is incorrect");
        }

    }
}
