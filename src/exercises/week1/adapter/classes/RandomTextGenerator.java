package exercises.week1.adapter.classes;

import exercises.week1.adapter.Interfaces.Logger;
import exercises.week1.adapter.Interfaces.TextGenerator;

public class RandomTextGenerator implements TextGenerator {
  @Override
  public void createString(int length, Logger logger) {
    logger.log("FROM: RandomTextGenerator -> " + logger.getClass().getName());
  }
}