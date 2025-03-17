package ManagerUsage.utils;

import com.Restaurant;
import com.database;

import java.util.ArrayList;
import java.util.Scanner;

public class AddRestaurant implements ProcessOption {
    @Override
    public void ProcessRequest(Restaurant hotel) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Restaurant Name:");
        String name = scan.nextLine();
        database data = database.getInstance();
        System.out.println("Enter the Address");
        String address = scan.nextLine();
        hotel.setName(name);
        hotel.setAddress(address);
        hotel.setStatus(true);
        ArrayList<String> items = new ArrayList<String>();
        while (true) {
            System.out.println("Enter the Item or Enter Exit to exit");
            String food = scan.nextLine();
            if (food.equals("exit")) {
                break;
            }
            items.add(food);

        }
        hotel.setMenu(items);
        data.setRestaurants(hotel);
    }
}
