package ui;

import model.Order;
import model.Platform;
import model.Product;

public class UpdateInformation {

    Platform platform;
    Product product;
    Order order;

    public UpdateInformation(){
        platform = Platform.getInstance();

    }

    public void updateRestaurantShow(){

    }

    public void updateOrderShow(){
        int opt = 0;
        updateStatusOrder(opt);
    }

    public String updateStatusOrder(int status){

            String finalStatus = "";

            switch (status){
                case 1:
                    finalStatus = order.getREQUESTED();
                    break;
                case 2:
                    finalStatus = order.getPROCESS();
                    break;
                case 3:
                    finalStatus = order.getSENT();
                    break;
                default:
                    System.out.println("The option is incorrect");

            }
            return finalStatus;
    }
}
