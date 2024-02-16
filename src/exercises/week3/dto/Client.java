package exercises.week3.dto;

import exercises.week3.dto.classes.Car;
import exercises.week3.dto.classes.Person;
import exercises.week3.dto.classes.PersonDTO;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Client {
  public void run() {
    try {
      // Creating person and cars
      Person person = new Person("Fredrik Lundell");
      List<Car> cars = new ArrayList<>();
      cars.add(new Car("Ferrari"));
      cars.add(new Car("Aston Martin"));

      // Create DTO-Object
      PersonDTO personDTO = new PersonDTO(person, cars);
      System.out.println("CLIENT: DTO created");

      // Send DTO-object to server
      try {
        Socket socket = new Socket("localhost", 12345);
        System.out.println("CLIENT: Connecting to Server...");
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());


        out.writeObject(personDTO);
        System.out.println("CLIENT: DTO sent to server");
      } catch(IOException e) {
        e.printStackTrace();
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}