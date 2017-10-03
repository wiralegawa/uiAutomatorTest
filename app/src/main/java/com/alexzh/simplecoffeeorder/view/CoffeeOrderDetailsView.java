package com.alexzh.simplecoffeeorder.view;

import com.alexzh.simplecoffeeorder.model.Coffee;

import java.util.TreeMap;

public interface CoffeeOrderDetailsView {

    void displayOrderedCoffeeList(TreeMap<Coffee, Integer> coffeeMap);

    void displayTotalPrice(float totalPrice);

    String getDeliveryInfo();

    void displayDeliveryInfo(String deliveryInfo);

    void disableDeliveryInfo();

    void enableDeliveryInfo();

    void sendNotification(TreeMap<Coffee, Integer> order);

    void moveToOrderList();
}
