import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    //--- Create products

    ProductFactory.createProduct("E1", "IPhone XS", 600, Category.ELECTRONIC);
    ProductFactory.createProduct("V1", "Bonnet", 10, Category.CLOTHING);
    ProductFactory.createProduct("A1", "Pain", 1, Category.FOOD);

    //--- Display logs

    System.out.println("----- ACTIVITY LOGS -----");

    ArrayList<String> logs = ActivityLogger.getInstance().getActivityLog();

    for(String log: logs) {
      System.out.println(log);
    }
  }
}
