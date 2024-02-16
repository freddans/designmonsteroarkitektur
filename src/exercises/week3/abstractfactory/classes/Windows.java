package exercises.week3.abstractfactory.classes;

import exercises.week3.abstractfactory.interfaces.MethodInterface;

public class Windows implements MethodInterface {
  @Override
  public void textOutPut() {
    System.out.println("Windows-text");
  }

  @Override
  public void button() {
    System.out.println("Windows-knapp");
  }
}