package exercises.week3.abstractfactory;

import exercises.week3.abstractfactory.classes.AbstractFactory;

public class Main {
  public static void main(String[] args) {
    AbstractFactory abstractFactory = new AbstractFactory();

    abstractFactory.getInfoBasedOnOS();
  }
}