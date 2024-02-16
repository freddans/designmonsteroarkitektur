package exercises.week3.factorymethod.classes;

public abstract class StringProducer {

  public static StringProducer getinstance(String choice){
    if (choice.contains("digit")) {
      return new DigitStringProducer();
    } else if (choice.contains("random")) {
      return new RandomStringProducer();
    } else {
      return null;
    }
  }

  public abstract String createString();

}