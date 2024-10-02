package org.shruti.InventoryDesign.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
public class Inventory {

    List<Product> productList = new ArrayList<>();



}
