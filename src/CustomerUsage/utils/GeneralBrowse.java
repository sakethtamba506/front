package CustomerUsage.utils;

import com.Restaurant;
import com.database;

import java.util.ArrayList;

public class GeneralBrowse implements browser{
    @Override
    public void ProcessRequest(String name) {
        database data = database.getInstance();
        ArrayList<Restaurant> restaurantArrayList = data.getRestaurants();
        System.out.println(restaurantArrayList);
        for(Restaurant restaurant : restaurantArrayList)
        {
            System.out.print(restaurant.getName()+" ");
            for(String item : restaurant.getMenu())
            {
                System.out.print(item+" ");
            }
            if(restaurant.getStatus())
            {
                System.out.print("- Open");
            }
            else {
                System.out.print("- Closed");
            }
            System.out.println("");
        }
        System.out.println("------------------------------------------------------------------------");
        System.out.println("");
    }
}
