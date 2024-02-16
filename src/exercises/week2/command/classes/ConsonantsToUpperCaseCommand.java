package exercises.week2.command.classes;

import exercises.week2.command.interfaces.CommandInterface;

public class ConsonantsToUpperCaseCommand implements CommandInterface {
  @Override
  public String process(String t) {
    int stringLength = t.length(); // Get length for for loop
    String[] arrOfT = t.split(""); // Split stringletters into array

    // checks if vowel lowercase. If so, uppercase it.
    for (int i = 0; i < stringLength; i++) {
      if (arrOfT[i].contains("b") || arrOfT[i].contains("c") || arrOfT[i].contains("d") || arrOfT[i].contains("f") ||
          arrOfT[i].contains("g") || arrOfT[i].contains("h") || arrOfT[i].contains("j") || arrOfT[i].contains("k") || arrOfT[i].contains("l") ||
          arrOfT[i].contains("m") || arrOfT[i].contains("n") || arrOfT[i].contains("p") || arrOfT[i].contains("q") || arrOfT[i].contains("r") ||
          arrOfT[i].contains("s") || arrOfT[i].contains("t") || arrOfT[i].contains("v") || arrOfT[i].contains("w") || arrOfT[i].contains("x") ||
          arrOfT[i].contains("z")) {

        arrOfT[i] = arrOfT[i].toUpperCase(); // replace current letter with uppercase
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