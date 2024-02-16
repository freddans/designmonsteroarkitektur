package exercises.week3.workerthread;

import exercises.week3.workerthread.classes.FormatString;
import exercises.week3.workerthread.classes.ReportService;
import exercises.week3.workerthread.classes.ReportWorkerThread;
import exercises.week3.workerthread.classes.StringQueue;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    StringQueue.getInstance().addString(new FormatString("Str1", new double[]{1, 2, 3, 4, 5}));
    StringQueue.getInstance().addString(new FormatString("Str2", new double[]{10, 20, 30, 40, 50}));
    StringQueue.getInstance().addString(new FormatString("Str3", new double[]{100, 200, 300, 400, 500}));

    new Thread(new ReportWorkerThread()).start();

    System.out.println(ReportService.getInstance().getReport());
    Thread.sleep(1000);
    System.out.println(ReportService.getInstance().getReport());
    Thread.sleep(6000);
    System.out.println(ReportService.getInstance().getReport());
    System.out.println(ReportService.getInstance().getReport());
  }
}