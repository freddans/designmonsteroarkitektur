package exercises.week2.strategy.classes.comparator;

import exercises.week2.strategy.classes.Product;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {
  @Override
  public int compare(Product product1, Product product2) {
    return product1.getPrice() - product2.getPrice();
  }
}
