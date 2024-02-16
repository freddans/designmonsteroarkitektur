package exercises.week2.observer;

import exercises.week2.observer.classes.Sensor;
import exercises.week2.observer.classes.Thermometer;

public class Main {
  public static void main(String[] args) {
    // Create thermometer
    Thermometer thermometer = new Thermometer();

    // Create temperaturewatcher
    Sensor sensor1 = new Sensor("Thermometer1");
    Sensor sensor2 = new Sensor("Thermometer2");

    // Register Observers
    thermometer.registerObserver(sensor1);
    thermometer.registerObserver(sensor2);

    // Set temp
    System.out.println("(setting temp)");
    thermometer.setTemperature(25.0);

    System.out.println();

    // Change temp
    System.out.println("(changing temp)");
    thermometer.setTemperature(30.0);

    System.out.println();

    // remove an observer
    System.out.println("(removing an observer)");
    thermometer.removeObserver(sensor1);

    System.out.println();

    // change temp again
    System.out.println("(changing temp)");
    thermometer.setTemperature(22.5);

    // Print the state of the Thermomeeter using toString
    System.out.println(thermometer.toString());
  }
}