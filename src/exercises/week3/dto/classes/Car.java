package exercises.week3.dto.classes;

import java.io.Serializable;

public class Car implements Serializable {
  // Properties
  private String model;

  // Constructor
  public Car(String model) {
    this.model = model;
  }

  // Getter
  public String getModel() {
    return model;
  }
}
