package ManagerUsage;

import ManagerUsage.utils.ProcessOption;
import com.Restaurant;
import com.UserDetails;
import com.database;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager extends UserDetails {
    helper help = new helper();
    ArrayList<Restaurant> UnderHotel = new ArrayList<Restaurant>();

    public void Start() {
        String[] options = help.getOptions().toArray(new String[0]);
        while (true) {
            for (String option : options) {
                System.out.println(option);
            }
            Scanner scan = new Scanner(System.in);
            String SelectedOpt = scan.nextLine();
            if (SelectedOpt.equals("4") || SelectedOpt.equals("Exit")) {
                break;
            }
            ProcessOption req = help.SelectedReq(SelectedOpt);
            Restaurant selectedRestaurant;
            if (SelectedOpt.equals("1")) {
                selectedRestaurant = new Restaurant();
                selectedRestaurant.setManager(getName());
                UnderHotel.add(selectedRestaurant);
            } else {
                for (Restaurant res : UnderHotel) {
                    System.out.println(res.getName());
                }
                System.out.println("Select A Hotel To Edit:");
                selectedRestaurant = UnderHotel.get(scan.nextInt() - 1);
                System.out.println("Selected Restaurant: " + selectedRestaurant.getName());
            }
            req.ProcessRequest(selectedRestaurant);

            database data = database.getInstance();
            ArrayList<Restaurant> listOfHotels = data.getRestaurants();
            for (Restaurant res : listOfHotels) {
                System.out.print(res.getName() + " " + res.getAddress() + " " + res.getMenu() + " " + res.getManager() + " " + res.getStatus());
                System.out.println("");
            }
        }
    }
}
