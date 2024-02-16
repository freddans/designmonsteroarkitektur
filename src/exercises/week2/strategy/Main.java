package exercises.week2.strategy;

import exercises.week2.strategy.classes.Product;
import exercises.week2.strategy.classes.ProductManager;

public class Main {
  public static void main(String[] args) {
    ProductManager productManager = new ProductManager();

    productManager.addProduct(new Product("Iphone 15 Pro", 1200, 10));
    productManager.addProduct(new Product("MacBook Air M1", 1400, 3));
    productManager.addProduct(new Product("Ipad Pro 12.5''", 900, 6));
    productManager.addProduct(new Product("Power King", 1, 65));
    productManager.addProduct(new Product("Air Pods", 700, 9));

    System.out.println("-- Sort by name(product) --");
    productManager.setStrategy("name");
    productManager.sortProducts();
    productManager.printProducts();

    System.out.println();
    System.out.println("-- Sort by price --");
    productManager.setStrategy("price");
    productManager.sortProducts();
    productManager.printProducts();

    System.out.println();
    System.out.println("-- Sort by Stock --");
    productManager.setStrategy("stock");
    productManager.sortProducts();
    productManager.printProducts();
  }
}