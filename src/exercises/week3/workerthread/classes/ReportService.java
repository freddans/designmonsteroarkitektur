package exercises.week3.workerthread.classes;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ReportService {
  Queue<String> reports = new ConcurrentLinkedQueue<>();
  private static ReportService reportService = new ReportService();

  public static ReportService getInstance() {
    return reportService;
  }

  public synchronized void addReport(String report) {
    reports.add(report);
  }

  public synchronized String getReport() {
    return reports.poll();
  }
}
