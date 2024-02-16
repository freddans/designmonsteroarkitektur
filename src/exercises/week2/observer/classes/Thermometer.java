package exercises.week2.observer.classes;

import exercises.week2.observer.interfaces.Observer;
import exercises.week2.observer.interfaces.Subject;

import java.util.ArrayList;

public class Thermometer implements Subject {
  private double temperature;
  private ArrayList<Observer> observers;

  // Constructor
  public Thermometer() {
    this.temperature = 0.0;
    this.observers = new ArrayList<>();
  }

  // Methods
  @Override
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyAllObservers() {
    for (Observer observer : observers) {
      observer.update(this);
    }
  }

  public void setTemperature(double temperature) {
    if (this.temperature != temperature) {
      this.temperature = temperature;
      notifyAllObservers();
    }
  }

  public double getTemperature() {
    return temperature;
  }

  @Override
  public String toString() {
    return "Thermometer{" +
        "temperature=" + temperature +
        '}';
  }
}