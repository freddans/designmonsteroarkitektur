package exercises.week3.dto;

import exercises.week3.dto.classes.Car;
import exercises.week3.dto.classes.Person;
import exercises.week3.dto.classes.PersonDTO;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class Server {

  public void run() {
    try {
      // Listen to port
      ServerSocket serverSocket = new ServerSocket(12345);
      System.out.println("SERVER: Waiting for connection...");

      // Accept connection from client
      try {
        Socket socket = serverSocket.accept();
        System.out.println("SERVER: Client connected");
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());


        // Recieve DTO-object from Client
        Object recievedObject = in.readObject();
        System.out.println("SERVER: DTO recieved");
        if (recievedObject instanceof PersonDTO) {
          PersonDTO recievedDTO = (PersonDTO) recievedObject;
          System.out.println("SERVER: Unpacking DTO");
          System.out.println();

          // Get Person-info and cars
          Person person = recievedDTO.getPerson();
          List<Car> cars = recievedDTO.getCars();

          // Print info
          System.out.println("Name: " + person.getName());
          if (!cars.isEmpty() && cars.size() == 1) {
            System.out.println("Car:");
            for (Car car : cars) {
              System.out.println("- " + car.getModel());
            }

          } else if (cars.size() > 1) {
            System.out.println("Cars:");
            for (Car car : cars) {
              System.out.println("- " + car.getModel());
            }
          }
        }
      } catch (ClassNotFoundException e) {
        e.printStackTrace();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}