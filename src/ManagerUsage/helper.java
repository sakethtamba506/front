package ManagerUsage;

import ManagerUsage.utils.AddRestaurant;
import ManagerUsage.utils.ChangeStatus;
import ManagerUsage.utils.ProcessOption;

import ManagerUsage.utils.AddItem;

import java.util.ArrayList;

public class helper {
    private ArrayList<String> options = new ArrayList<String>();

    public helper() {
        options.add("Add Restaurant");
        options.add("Add Items To Menu");
        options.add("Change Status");
        options.add("Exit");
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public ProcessOption SelectedReq(String opt) {
        return switch (opt) {
            case "1" -> new AddRestaurant();
            case "2" -> new AddItem();
            case "3" -> new ChangeStatus();
            default -> throw new IllegalArgumentException("Invalid Opt type");
        };
    }

}
