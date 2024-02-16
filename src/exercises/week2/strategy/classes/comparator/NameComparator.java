package exercises.week2.strategy.classes.comparator;

import exercises.week2.strategy.classes.Product;

import java.util.Comparator;

public class NameComparator implements Comparator<Product> {
  @Override
  public int compare(Product product1, Product product2) {
    return product1.getName().compareTo(product2.getName());
  }
}