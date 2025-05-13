public abstract class ProductBase implements Product {
  private String id;
  private String name;
  private double price;
  private String category;

  public ProductBase(String id, String name, double price, String category) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.category = category;

    ActivityLogger.getInstance().logActivity(
      String.format("Created new product: %s", this.getDescription())
    );
  }

  @Override
  public String getDescription() {
    return String.format("Product%s : %s, %s, %s, %s", this.id, this.id, this.name, this.price, this.category);
  }
}
