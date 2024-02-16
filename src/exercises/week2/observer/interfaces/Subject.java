package exercises.week2.observer.interfaces;

public interface Subject {
  public void registerObserver(Observer observer);
  public void removeObserver(Observer observer);
  public void notifyAllObservers();
}
