package exercises.week1.adapter;

import exercises.week1.adapter.classes.CurrentLogger;
import exercises.week1.adapter.classes.LoggerAdapter;
import exercises.week1.adapter.classes.RandomTextGenerator;

public class Main {
  public static void main(String[] args) {
    RandomTextGenerator rtg = new RandomTextGenerator();

    rtg.createString(1, new CurrentLogger());
    System.out.println();
    rtg.createString(1, new LoggerAdapter());
    System.out.println();
  }
}