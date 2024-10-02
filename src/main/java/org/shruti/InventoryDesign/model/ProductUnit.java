package org.shruti.InventoryDesign.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ProductUnit {
    int productUnitId;
    String productName;
    String expiryDate;
    String serialNumber;

}
