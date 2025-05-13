public class SalesService implements Observer {
  @Override
  public void update(ProductBase product) {
    ActivityLogger.getInstance().logActivity("Updated product (sales): " + product.getDescription());
  } 
}
