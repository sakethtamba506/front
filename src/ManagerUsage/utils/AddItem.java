package ManagerUsage.utils;

import com.Restaurant;

import java.util.ArrayList;
import java.util.Scanner;

public class AddItem implements ProcessOption {
    @Override
    public void ProcessRequest(Restaurant restaurant) {
        System.out.println("Enter the Items You Want to Add or Enter Exit:");
        Scanner scan = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<String>();
        while (true) {
            System.out.println("Enter");
            String input = scan.nextLine();
            if (input.equals("exit")) {
                break;
            }
            items.add(input);
        }
        restaurant.setMenu(items);
    }
}
