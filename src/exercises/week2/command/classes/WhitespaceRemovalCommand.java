package exercises.week2.command.classes;

import exercises.week2.command.interfaces.CommandInterface;

public class WhitespaceRemovalCommand implements CommandInterface {
  @Override
  public String process(String t) {
    String[] arrOfT = t.split(" "); // Split based on space
    int amountOfSplits = 0;

    // count amount of splits
    for(String splits : arrOfT) {
      amountOfSplits += 1;
    }

    String buildBackWord = "";

    // Build back together
    for (int i = 0; i < amountOfSplits; i++) {
      buildBackWord += arrOfT[i]; // add all letters back together
    }

    return buildBackWord;
  }
}