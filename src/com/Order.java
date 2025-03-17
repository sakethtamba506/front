package com;

import java.util.ArrayList;

public class Order {
    String CustomerName;
    String RestaurantName;
    ArrayList<SelectedItem> items;
    String PaymentType;
    boolean PaymentStatus = false;

    public String getPaymentType() {
        return PaymentType;
    }

    public void setPaymentType(String paymentType) {
        PaymentType = paymentType;
    }

    public boolean isPaymentStatus() {
        return PaymentStatus;
    }

    public void setPaymentStatus(boolean paymentStatus) {
        PaymentStatus = paymentStatus;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getRestaurantName() {
        return RestaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        RestaurantName = restaurantName;
    }

    public ArrayList<SelectedItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<SelectedItem> items) {
        this.items = items;
    }
}
