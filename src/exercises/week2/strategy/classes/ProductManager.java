package exercises.week2.strategy.classes;

import exercises.week2.strategy.classes.comparator.NameComparator;
import exercises.week2.strategy.classes.comparator.PriceComparator;
import exercises.week2.strategy.classes.comparator.StockComparator;

import java.util.ArrayList;
import java.util.Comparator;

public class ProductManager {
  private String strategy = "Default";
  private ArrayList<Product> products = new ArrayList<>();

  public void addProduct(Product product) {
    this.products.add(product);
  }

  public void setStrategy(String strategy) {
    this.strategy = strategy;
  }

  public void sortProducts() {
    Comparator<Product> comparator;
    switch (strategy) {
      case "price" : comparator = new PriceComparator();
        break;
      case "stock" : comparator = new StockComparator();
        break;
      default:comparator = new NameComparator();
    }
    products.sort(comparator);
  }

  public void printProducts() {
    for (Product product : products) {
      System.out.println(product.getName() + ", $" + product.getPrice() + ". Stock: " + product.getStock());
    }
  }
}
