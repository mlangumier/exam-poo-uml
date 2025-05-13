import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    //--- Setup observers
    
    Inventory inventory = new Inventory();
    Observer salesService = new SalesService();
    Observer warehouseService = new WarehouseService();

    inventory.registerObserver(salesService);
    inventory.registerObserver(warehouseService);

    //--- Create products & add them to the inventory

    ProductBase iphone = ProductFactory.createProduct("E1", "IPhone XS", 600, Category.ELECTRONIC);
    inventory.addProduct(iphone);

    ProductBase bonnet = ProductFactory.createProduct("V1", "Bonnet", 10, Category.CLOTHING);
    inventory.addProduct(bonnet);
    
    ProductBase pain = ProductFactory.createProduct("A1", "Pain", 1, Category.FOOD);
    inventory.addProduct(pain);

    //--- Display logs

    System.out.println("----- ACTIVITY LOGS -----");

    ArrayList<String> logs = ActivityLogger.getInstance().getActivityLog();

    for(String log: logs) {
      System.out.println(log);
    }
  }
}
