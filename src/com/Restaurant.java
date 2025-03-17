package com;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private String Address;
    private Menu menu = new Menu();
    private ArrayList<Order> orders = new ArrayList<Order>();

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(Order order) {
        orders.add(order);
    }

    private boolean status;

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    private String manager;

    public void setMenu(ArrayList<String> items) {
        menu.AddItem(items);
    }

    public ArrayList<String> getMenu() {
        return menu.getItems();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return Address;
    }

}
