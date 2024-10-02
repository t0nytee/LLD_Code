package org.shruti.InventoryDesign;

import org.shruti.InventoryDesign.model.Warehouse;

import java.util.List;

public abstract class WarehouseSelectionStrategy {

    public abstract Warehouse selectWarehouse(List<Warehouse> warehouseList);
}
