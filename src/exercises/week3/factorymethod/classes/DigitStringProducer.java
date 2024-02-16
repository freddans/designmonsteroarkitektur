package exercises.week3.factorymethod.classes;

import java.util.Random;

public class DigitStringProducer extends StringProducer {

  @Override
  public String createString() {
    Random random = new Random();
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < 8; i++) {
      int randomDigit = random.nextInt(10);
      stringBuilder.append(randomDigit);
    }
    return stringBuilder.toString();
  }
}