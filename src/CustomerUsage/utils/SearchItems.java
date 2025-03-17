package CustomerUsage.utils;

import com.Restaurant;
import com.database;

import java.util.ArrayList;

public class SearchItems implements browser {
    @Override
    public void ProcessRequest(String name) {
        database data = database.getInstance();
        ArrayList<Restaurant> restaurantArrayList = data.getRestaurants();
        for (Restaurant restaurant : restaurantArrayList) {

            for (String item : restaurant.getMenu()) {
                if(item.equals(name))
                {
                    System.out.print(restaurant.getName());
                    if(restaurant.getStatus())
                    {
                        System.out.println(" - Open");
                    }
                    else {
                        System.out.println(" - Closed");
                    }
                }
            }
            System.out.println("");
        }
        System.out.println("--------------------------------------------------------------------");
    }
}
