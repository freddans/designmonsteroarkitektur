package exercises.week3.dto;

public class Main {
  public static void main(String[] args) {

    run();
  }

  public static void run() {
    System.out.println("----------");
    System.out.println(" STARTING");
    System.out.println("----------");
    // Run the server
    Thread serverThread = new Thread(() -> {
      Server server = new Server();
      server.run();
    });
    serverThread.start();

    // Run the client
    Thread clientThread = new Thread(() -> {
      Client client = new Client();
      client.run();
    });
    clientThread.start();
  }
}