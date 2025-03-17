package com;

import java.util.ArrayList;

public class Menu {
    private ArrayList<String> items = new ArrayList<String>();

    public ArrayList<String> getItems() {
        return items;
    }

    public void AddItem(ArrayList<String> Item) {
        items.addAll(Item);
    }
}
