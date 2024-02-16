package exercises.week3.factorymethod.classes;

import java.util.Random;

public class RandomStringProducer extends StringProducer {

  @Override
  public String createString() {
    Random random = new Random();
    char[] alphabet = "abcdefghijklmnopqrstuvwxyzåäöABCDEFGHIJKLMNOPQRSTUVWXYZÅÄÖ".toCharArray();
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < 8; i++) {
      int randomNumber = random.nextInt(58);
      char randomLetter = alphabet[randomNumber];
      stringBuilder.append(randomLetter);
    }
    return stringBuilder.toString();
  }
}
