public class WarehouseService implements Observer {
  @Override
  public void update(ProductBase product) {
    ActivityLogger.getInstance().logActivity("Updated product (warehouse): " + product.getDescription());
  } 
}
