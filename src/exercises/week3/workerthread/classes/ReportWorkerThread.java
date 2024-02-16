package exercises.week3.workerthread.classes;

public class ReportWorkerThread implements Runnable {
  @Override
  public void run() {
    while(true) {
      FormatString formatString = StringQueue.getInstance().getStr();
      if (formatString != null) {
        System.out.println("Report generation started");
        double amount = 0;
        for (int i = 0; i < formatString.getTransaction().length; i++) {
          amount += formatString.getTransaction()[i];
        }
        String report = formatString.getStr() + "\n" + "Amont: " + amount + "\n";

        ReportService.getInstance().addReport(report);
      }
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}