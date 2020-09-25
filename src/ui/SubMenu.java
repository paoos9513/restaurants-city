package ui;

import java.util.Scanner;

public class SubMenu {
    Scanner scan = new Scanner(System.in);
    int opt;

    Show show = new Show();

    public SubMenu(){
        subMenu();
    }

    public void subMenu(){
        while (opt!=5) {
            System.out.println(" ");
            System.out.println("----------------SUB MENU----------------");
            System.out.println("Select the option you want \n");
            System.out.println( "(1).Show Restaurants \n" +
                                "(2). Show Products \n"  +
                                "(3). Show Clients \n" +
                                "(4). Show Orders \n" +
                                "(5). EXIT \n"
            );

            opt = Integer.parseInt(scan.nextLine());
            switch (opt){
                case 1:
                    show.showRestaurants();
                    break;
                case 2:
                    show.showProducts();
                    break;
                case 3:
                    show.showClients();
                    break;
                case 4:
                    show.showOrder();
                    break;
                case 5:
                    new Menu();
                    break;
                default:
                    System.out.println("the option incorrect");
            }


        }
    }

    public void subMenuUpdate(){
        while (opt!=4) {
            System.out.println(" ");
            System.out.println("----------------SUB MENU UPDATE----------------");
            System.out.println("Select the option you want to update \n");
            System.out.println( "(1). \n" +
                    "(2).Update Products \n"  +
                    "(3).Update Clients \n" +
                    "(4).Exit \n"
            );
            opt = Integer.parseInt(scan.nextLine());
            switch (opt){
                case 1:
                    show.showRestaurants();
                    break;
                case 2:
                    show.showProducts();
                    break;
                case 3:
                    show.showClients();
                    break;
                case 4:
                    show.showOrder();
                    break;
                case 5:
                    new Menu();
                    break;
                default:
                    System.out.println("the option incorrect");
            }


        }

    }

}
