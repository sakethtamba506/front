import CustomerUsage.Customer;
import com.database;

import java.util.ArrayList;

public class CustomerSession implements Session {
    public void StartSession() {
        UserSearch search = new UserSearch();
        Customer user = (Customer) search.Search_Create(1);
        database data = database.getInstance();
        ArrayList<Customer> array = data.getCustomerList();
        for(Customer k : array)
        {
            System.out.println(k.getName());
        }
        user.Start();
    }
}
