package exercises.week2.command;

import exercises.week2.command.classes.ConsonantsToUpperCaseCommand;
import exercises.week2.command.classes.VowelsToUpperCaseCommand;
import exercises.week2.command.classes.VowelsToWhitespaceCommand;
import exercises.week2.command.classes.WhitespaceRemovalCommand;

public class Main {
  public static void main(String[] args) {
    ConsonantsToUpperCaseCommand consonantsToUpperCaseCommand = new ConsonantsToUpperCaseCommand();
    VowelsToUpperCaseCommand vowelsToUpperCaseCommand = new VowelsToUpperCaseCommand();
    VowelsToWhitespaceCommand vowelsToWhitespaceCommand = new VowelsToWhitespaceCommand();
    WhitespaceRemovalCommand whitespaceRemovalCommand = new WhitespaceRemovalCommand();

    // What it should look like
    // actual method result

    System.out.println("FReDRiK LuNDeLL");
    System.out.println(consonantsToUpperCaseCommand.process("fredrik lundell"));
    System.out.println();
    System.out.println("frEdrIk lUndEll");
    System.out.println(vowelsToUpperCaseCommand.process("fredrik lundell"));
    System.out.println();
    System.out.println("fr dr k l nd ll");
    System.out.println(vowelsToWhitespaceCommand.process("fredrik lundell"));
    System.out.println();
    System.out.println("fredriklundell");
    System.out.println(whitespaceRemovalCommand.process("fredrik lundell"));
  }
}