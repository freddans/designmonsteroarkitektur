package exercises.week3.dto.classes;

import java.io.Serializable;
import java.util.List;

public class PersonDTO implements Serializable {
  // Properties
  private Person person;
  private List<Car> cars;

  // Constructor
  public PersonDTO(Person person, List<Car> cars) {
    this.person = person;
    this.cars = cars;
  }

  // Getters
  public Person getPerson() {
    return person;
  }

  public List<Car> getCars() {
    return cars;
  }
}
