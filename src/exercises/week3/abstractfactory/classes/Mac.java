package exercises.week3.abstractfactory.classes;

import exercises.week3.abstractfactory.interfaces.MethodInterface;

public class Mac implements MethodInterface {
  @Override
  public void textOutPut() {
    System.out.println("Mac-text");
  }

  @Override
  public void button() {
    System.out.println("Mac-knapp");
  }
}