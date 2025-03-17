import CustomerUsage.Customer;
import ManagerUsage.Manager;
import com.UserDetails;
import com.database;

import java.util.ArrayList;
import java.util.Scanner;

public class UserSearch {
    public UserDetails Search_Create(int type) {
        if (type == 0) {
            System.out.println("Enter 1 if Existing Manager or 2 to Create Manager");
        } else {
            System.out.println("Enter 1 if Existing Customer or 2 to Create Customer");
        }
        Scanner scan = new Scanner(System.in);
        database data = database.getInstance();
        UserDetails user = null;
        int opt = scan.nextInt();
        if (opt == 1) {
            System.out.println("Enter you Name:");
            Scanner scan3 = new Scanner(System.in);
            String input = scan3.nextLine();
            ArrayList<? extends UserDetails> users = type == 0 ? data.getManagerList():data.getCustomerList();
            for (UserDetails man : users) {
                user = man;
                if (input.equals(man.getName())) {
                    break;
                }
            }
        } else {
            if (type == 0) {
                user = new Manager();
                data.setManagerList((Manager) user);
            } else {
                user = new Customer();
                data.setCustomerList((Customer) user);
            }
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Enter your Name: ");
            String name = scan2.nextLine();
            System.out.println("Enter your Email: ");
            String Email = scan2.nextLine();
            System.out.println("Enter your Address: ");
            String address = scan2.nextLine();
            user.setName(name);
            user.setEmail(Email);
            user.setAddress(address);
        }
        return user;
    }
}
