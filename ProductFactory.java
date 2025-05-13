public class ProductFactory {
  public static ProductBase createProduct(String id, String name, double price, Category category) {
    switch(category) {
      case Category.CLOTHING:
        return new Clothing(id, name, price, "Vêtement");
      case Category.FOOD:
        return new Food(id, name, price, "Alimentaire");
      case Category.ELECTRONIC:
        return new Food(id, name, price, "Électronique");
      default: 
        throw new IllegalArgumentException("Invalid product type: " + category);
    }
  };
}
