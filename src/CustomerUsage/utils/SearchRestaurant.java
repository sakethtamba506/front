package CustomerUsage.utils;

import com.Restaurant;
import com.database;

import java.util.ArrayList;

public class SearchRestaurant implements browser {
    @Override
    public void ProcessRequest(String name) {
        database data = database.getInstance();
        ArrayList<Restaurant> restaurantArrayList = data.getRestaurants();

        for (Restaurant restaurant : restaurantArrayList) {
            if (name.equals(restaurant.getName())) {
                if (restaurant.getStatus()) {
                    System.out.println("Searched Restaurant is currently: Open");
                } else {
                    System.out.println("Searched Restaurant is currently: Closed");
                }
                for (String item : restaurant.getMenu()) {
                    System.out.println(item);
                }
                System.out.println("--------------------------------------------------------------------");
                System.out.println("");
            }
        }
    }
}
