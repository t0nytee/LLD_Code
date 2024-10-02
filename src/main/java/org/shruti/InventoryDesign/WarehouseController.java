package org.shruti.InventoryDesign;

import org.shruti.InventoryDesign.model.Warehouse;

import java.util.List;

public class WarehouseController {

    List<Warehouse> warehouseList;
    WarehouseSelectionStrategy warehouseSelectionStrategy;

    public WarehouseController(List<Warehouse> warehouseList, WarehouseSelectionStrategy warehouseSelectionStrategy) {
        this.warehouseList = warehouseList;
        this.warehouseSelectionStrategy = warehouseSelectionStrategy;
    }

    public Warehouse selectWarehouse(WarehouseSelectionStrategy selectionStrategy) {
        warehouseSelectionStrategy = selectionStrategy;
       return warehouseSelectionStrategy.selectWarehouse(warehouseList);
    }
}
