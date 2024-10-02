package org.shruti.InventoryDesign.model;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    Map<Integer, Integer> productIdVsCountMap = new HashMap<>();

    public void addItemToCart(int productId, int count) {
        productIdVsCountMap.put(productId, count + productIdVsCountMap.getOrDefault(productId, 0));
    }
    public void removeItemFromCar(Integer productId, int count) {
        if(productIdVsCountMap.containsKey(productId)) {
            productIdVsCountMap.put(productId, productIdVsCountMap.getOrDefault(productId, 0) - count);
        }
        if(productIdVsCountMap.get(productId)<=0) {
            productIdVsCountMap.remove(productId);
        }
    }

    public Map<Integer, Integer> getCartItems() {
        return  productIdVsCountMap;
    }
}
