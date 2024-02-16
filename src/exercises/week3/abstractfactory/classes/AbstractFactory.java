package exercises.week3.abstractfactory.classes;

public class AbstractFactory {

  public void getInfoBasedOnOS() {
    String clientOS = System.getProperty("os.name");

    if (clientOS.startsWith("Mac")) {
      Mac mac = new Mac();
      mac.textOutPut();
      mac.button();

    } else if (clientOS.startsWith("Win")) {
      Windows windows = new Windows();
      windows.textOutPut();
      windows.button();
    }
  }
}