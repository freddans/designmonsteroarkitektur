package exercises.week2.observer.classes;

import exercises.week2.observer.interfaces.Observer;
import exercises.week2.observer.interfaces.Subject;

public class Sensor implements Observer {
  private String name;

  // Constructor
  public Sensor(String name) {
    this.name = name;
  }

  // Methods
  @Override
  public void update(Subject subject) {
    if (subject instanceof Thermometer) {
      Thermometer thermometer = (Thermometer) subject;
      double temperature = thermometer.getTemperature();
      System.out.println(name + ": the temperature has changed to: " + temperature);
    }
  }

  public String getName() {
    return name;
  }
}