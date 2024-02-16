package exercises.week3.objectpool.classes;

import java.util.Random;

public class StringProducer {

  public String createString() {

    // Randomizer, alphabet in char + Stringbuilder
    Random random = new Random();
    char[] alphabet = "abcdefghijklmnopqrstuvwxyzäåö".toCharArray();
    StringBuilder stringBuilder = new StringBuilder();

    // For loop
    for (int i = 0; i < 8; i++) {
      int randomIndexNumber = random.nextInt(alphabet.length);
      char randomChar = alphabet[randomIndexNumber];
      stringBuilder.append(randomChar);
    }

    return stringBuilder.toString();
  }
}