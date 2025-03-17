import com.Order;
import com.Restaurant;
import com.SelectedItem;
import com.database;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Choose an User to Continue Customer/Manager/Delivery/Exit");
            String input = scan.nextLine();
            if (input.equals("exit")) {
                break;
            }
            Session user = helper.help(input);
            user.StartSession();
        }
        database data = database.getInstance();
        for(Order order :data.getOrders()){
            System.out.println(order.getCustomerName()+ " "+ order.getRestaurantName()+" "+ order.getPaymentType());
            for(SelectedItem item : order.getItems())
            {
                System.out.println(item.getItem()+ " "+ item.getServings());
            }
        }


    }
}