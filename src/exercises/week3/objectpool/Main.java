package exercises.week3.objectpool;

import exercises.week3.objectpool.classes.StringProducer;
import exercises.week3.objectpool.classes.StringProducerPool;

public class Main {
  public static void main(String[] args) {

    // Creating 5 StringProducers and puts into pool-list
    StringProducerPool pool = new StringProducerPool(5);

    // Get an object from the pool and use
    StringProducer stringProducer1 = pool.getObject();
    System.out.println("Generated String: " + stringProducer1.createString());
    pool.releaseObject(stringProducer1);

    System.out.println();

    // Get another object and use
    StringProducer stringProducer2 = pool.getObject();
    System.out.println("Generated String: " + stringProducer2.createString());
    pool.releaseObject(stringProducer2);

    System.out.println();

    // Get the same object again to demonstrate re-use
    StringProducer stringProducer3 = pool.getObject();
    System.out.println("Generated String: " + stringProducer3.createString());
    pool.releaseObject(stringProducer3);
  }
}