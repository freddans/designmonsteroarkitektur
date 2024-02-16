package exercises.week3.factorymethod;

import exercises.week3.factorymethod.classes.StringProducer;

public class Main {
  public static void main(String[] args) {
    // Factory Method
    // En del av mönstret: Overloading Methods

    StringProducer randomProducer = StringProducer.getinstance("random");
    StringProducer digitProducer = StringProducer.getinstance("digit");


    System.out.println("Random String: " + randomProducer.createString());
    System.out.println("Digit String: " + digitProducer.createString());
  }
}