package CustomerUsage;

import CustomerUsage.utils.*;

import java.util.ArrayList;

public class helper {
    private ArrayList<String> options = new ArrayList<String>();

    public helper() {
        options.add("Place Order");
        options.add("Cancel Order");
        options.add("General Browse");
        options.add("Search Restaurant");
        options.add("Search Food Item");
        options.add("Exit");
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public browser SearchReq(String opt) {
        return switch (opt) {
            case "3" -> new GeneralBrowse();
            case "4" -> new SearchRestaurant();
            case "5" -> new SearchItems();
            default -> throw new IllegalArgumentException("Invalid Opt type");
        };
    }

    public OrderHelp OrderRequest(String opt)
    {
        return switch (opt) {
            case "1" -> new PlaceOrder();
            case "2" -> new CancelOrder();
            default -> null;
        };
    }


}
