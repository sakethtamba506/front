package CustomerUsage.utils;

import CustomerUsage.Customer;
import CustomerUsage.helper;
import Payment.PaymentHelp;
import Payment.PaymentProcesser;
import com.Order;
import com.Restaurant;
import com.SelectedItem;
import com.database;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateOrder {
    private helper help = new helper();
    public Order takeOrder(String name)
    {
        Order order = new Order();
        Restaurant restaurant = null;
        database data = database.getInstance();
        for(Restaurant hotel : data.getRestaurants())
        {
            System.out.println(hotel.getName());
        }
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Select a restaurant from Above");
        String restaurantname = scan3.nextLine();
        for(Restaurant hotel : data.getRestaurants())
        {
            restaurant = hotel;
            if(restaurantname.equals(hotel.getName())){
                break;
            }
        }
        ArrayList<SelectedItem> OrderList = new ArrayList<SelectedItem>();
        while(true)
        {
            for(String item: restaurant.getMenu())
            {
                System.out.println(item);
            }
            Scanner scan = new Scanner(System.in);
            System.out.println("Select an Item from Above or Enter Exit if you are done with Ordering");
            String item = scan.nextLine();
            if(item.equals("exit"))
            {
                break;
            }
            System.out.println("No of Servings");
            int servings = scan.nextInt();
            SelectedItem OrderItem = new SelectedItem();
            OrderItem.setItem(item);
            OrderItem.setServings(servings);
            OrderList.add(OrderItem);
        }
        order.setItems(OrderList);
        order.setCustomerName(name);
        order.setRestaurantName(restaurant.getName());
        OrderHelp process = help.OrderRequest("1");
        process.ProcessRequest(order);
        restaurant.setOrders(order);
        return order;
    }
}
