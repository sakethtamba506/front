package CustomerUsage;

import CustomerUsage.utils.CreateOrder;
import CustomerUsage.utils.browser;
import com.Order;
import com.SelectedItem;
import com.UserDetails;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer extends UserDetails {
    helper help = new helper();
    ArrayList<Order> orders = new ArrayList<Order>();
    public void Start() {
        String[] options = help.getOptions().toArray(new String[0]);


        for(Order order : orders){
            System.out.println(order.getCustomerName()+ " "+ order.getRestaurantName()+" "+ order.getPaymentType());
            for(SelectedItem item : order.getItems())
            {
                System.out.println(item.getItem()+ " "+ item.getServings());
            }
        }


        while(true)
        {
            for (String option : options) {
                System.out.println(option);
            }
            Scanner scan = new Scanner(System.in);
            String SelectedOpt = scan.nextLine();
            if (SelectedOpt.equals("6") || SelectedOpt.equals("Exit")) {
                break;
            }
            if(SelectedOpt.equals("1"))
            {
                CreateOrder createOrder = new CreateOrder();
                Order takenOrder = createOrder.takeOrder(getName());
                orders.add(takenOrder);
            }
            else {
                browser browse = help.SearchReq(SelectedOpt);
                System.out.println(browse);
                String searchcontent = "";
                if(SelectedOpt.equals("3"))
                {
                    searchcontent = "";
                }
                else {
                    Scanner scan2 = new Scanner(System.in);
                    searchcontent = scan2.nextLine();
                }
                browse.ProcessRequest(searchcontent);
            }
        }
    }
}
