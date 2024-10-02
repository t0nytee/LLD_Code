package org.shruti.InventoryDesign.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
public class Product {

    int productId;
    String productName;
    List<ProductUnit> products = new ArrayList<>();
    double price;

    public void addProductUnits(ProductUnit productUnit, int count) {

    }

    public void removeProductUnits(ProductUnit productUnit, int count){

    }


}
