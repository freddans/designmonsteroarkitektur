package exercises.week1.adapter.classes;

import exercises.week1.adapter.Interfaces.Logger;

public class CurrentLogger implements Logger {
  // var
  private String name = "CurrentLogger";

  // Methods
  @Override
  public void log(String str) {
    System.out.println("FROM: CurrentLogger (old logger system)");
    System.out.println("str: " + str);
  }

  // Getters and Setters
  public String getName() {
    return name;
  }
}