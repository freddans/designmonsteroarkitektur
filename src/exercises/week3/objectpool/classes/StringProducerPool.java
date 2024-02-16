package exercises.week3.objectpool.classes;

import java.util.ArrayList;
import java.util.List;

public class StringProducerPool {
  private List<StringProducer> pool;

  public StringProducerPool(int poolSize) {
    pool = new ArrayList<>(poolSize);
    for (int i = 0; i < poolSize; i++) {
      pool.add(new StringProducer());
    }
  }

  public StringProducer getObject() {
    if (pool.isEmpty()) {
      System.out.println("Pool empty. Creating new StringProducer");
      return new StringProducer();
    } else {
      System.out.println("Reusing an object from Pool-list");
      return pool.remove(0);
    }
  }

  public void releaseObject(StringProducer stringProducer) {
    pool.add(stringProducer);
    System.out.println("Object returned to the pool");
  }
}