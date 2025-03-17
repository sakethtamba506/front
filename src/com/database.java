package com;

import CustomerUsage.Customer;
import ManagerUsage.Manager;

import java.util.ArrayList;

public class database {
    private static final database instance = new database();
    private ArrayList<Restaurant> restaurants = new ArrayList<Restaurant>();
    private ArrayList<Manager> ManagerList = new ArrayList<Manager>();
    private ArrayList<Customer> CustomerList = new ArrayList<Customer>();
    private ArrayList<Order> orders = new ArrayList<Order>();

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(Order order) {
        orders.add(order);
    }

    public ArrayList<Customer> getCustomerList() {
        return CustomerList;
    }

    public void setCustomerList(Customer customer) {
        CustomerList.add(customer);
    }

    public static database getInstance() {
        return instance;
    }

    public ArrayList<Manager> getManagerList() {
        return ManagerList;
    }

    public void setManagerList(Manager managerList) {
        ManagerList.add(managerList);
    }

    public ArrayList<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(Restaurant hotel) {
        restaurants.add(hotel);
    }
}
