import ManagerUsage.Manager;
import com.Restaurant;
import com.database;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerSession implements Session {
    public void StartSession() {
        UserSearch search = new UserSearch();
        Manager user = (Manager) search.Search_Create(0);
        database data = database.getInstance();
        ArrayList<Manager> array = data.getManagerList();
        for(Manager k : array)
        {
            System.out.println(k.getName());
        }
        user.Start();
    }
}
