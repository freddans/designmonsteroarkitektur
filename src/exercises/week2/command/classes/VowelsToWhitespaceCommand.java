package exercises.week2.command.classes;

import exercises.week2.command.interfaces.CommandInterface;

public class VowelsToWhitespaceCommand implements CommandInterface {
  @Override
  public String process(String t) {
    int stringLength = t.length(); // Get length for for loop
    String[] arrOfT = t.split(""); // Split stringletters into array

    // checks if vowel lowercase. If so, uppercase it.
    for (int i = 0; i < stringLength; i++) {
      if (arrOfT[i].contains("a") || arrOfT[i].contains("o") || arrOfT[i].contains("u") || arrOfT[i].contains("å") ||
          arrOfT[i].contains("e") || arrOfT[i].contains("i") || arrOfT[i].contains("y") || arrOfT[i].contains("ä") || arrOfT[i].contains("ö")) {

        arrOfT[i] = " "; // replace current letter with uppercase
      }
    }

    String buildBackWord = "";

    // Build back together
    for (int i = 0; i < stringLength; i++) {
      buildBackWord += arrOfT[i]; // add all letters back together
    }

    return buildBackWord;
  }
}