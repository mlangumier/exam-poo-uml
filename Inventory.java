import java.util.ArrayList;

public class Inventory {
  private ArrayList<Observer> observers = new ArrayList<Observer>();

  public void registerObserver(Observer observer) {
    if(observer != null) {
      observers.add(observer);
    };
  }

  public void notifyObservers(ProductBase product) {
    for(Observer observer: observers) {
      observer.update(product);
    }
  }

  public void addProduct(ProductBase product) {
    notifyObservers(product);
  }
}
