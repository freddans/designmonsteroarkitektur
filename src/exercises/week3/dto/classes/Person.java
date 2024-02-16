package exercises.week3.dto.classes;

import java.io.Serializable;

public class Person implements Serializable {
  // Properties
  private String name;

  // Constructor
  public Person(String name) {
    this.name = name;
  }

  // Getter
  public String getName() {
    return name;
  }
}
