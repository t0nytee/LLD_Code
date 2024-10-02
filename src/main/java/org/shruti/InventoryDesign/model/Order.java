package org.shruti.InventoryDesign.model;

import java.util.Map;

public class Order {

    String orderId;
    User user;
    Address deliveryAddress;

    Map<Integer, Integer> cartItems;

    Payment payment;
    OrderStatus orderStatus;
    Warehouse warehouse;
    Invoice invoice;



}
