package CustomerUsage.utils;

import CustomerUsage.Customer;
import Payment.PaymentHelp;
import Payment.PaymentProcesser;
import com.Order;
import com.Restaurant;
import com.SelectedItem;
import com.database;

import java.util.ArrayList;
import java.util.Scanner;

public class PlaceOrder implements OrderHelp{
    @Override
    public void ProcessRequest(Order order) {
        PaymentProcesser paymentProcesser = new PaymentProcesser();
        System.out.println("Select Type of Payment to Proceed with Payment");
        for(String type : paymentProcesser.getOptions())
        {
            System.out.println(type);
        }
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();
        PaymentHelp gateway = paymentProcesser.PaymentRequest(type);
        if(gateway.PaymentProcess(50)) {
            System.out.println("Payment Done");
            database data = database.getInstance();
            order.setPaymentType(type);
            order.setPaymentStatus(true);
            data.setOrders(order);
        }
        else {
            System.out.println("Payment Failed");
        }
    }
}
