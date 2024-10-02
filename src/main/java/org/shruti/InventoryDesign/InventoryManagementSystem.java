package org.shruti.InventoryDesign;

public class InventoryManagementSystem {

    OrderController orderController;
    WarehouseController warehouseController;
    UserController userController;

    public InventoryManagementSystem(OrderController orderController, WarehouseController warehouseController, UserController userController) {
        this.orderController = orderController;
        this.warehouseController = warehouseController;
        this.userController = userController;
    }

}
