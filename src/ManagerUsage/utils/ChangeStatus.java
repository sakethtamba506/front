package ManagerUsage.utils;

import com.Restaurant;

public class ChangeStatus implements ProcessOption {
    @Override
    public void ProcessRequest(Restaurant restaurant) {
        restaurant.setStatus(!restaurant.getStatus());
    }
}
