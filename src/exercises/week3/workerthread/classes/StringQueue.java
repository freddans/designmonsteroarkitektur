package exercises.week3.workerthread.classes;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class StringQueue {
  Queue<FormatString> strs = new ConcurrentLinkedQueue<>();

  private static StringQueue stringQueue = new StringQueue();

  public static StringQueue getInstance() {
    return stringQueue;
  }

  public synchronized void addString(FormatString str) {
    System.out.println("Number of strings in queue before string added: " + strs.size());
    strs.add(str);
  }

  public synchronized FormatString getStr() {
    System.out.println("Number of Strings in queue before string is removed: " + strs.size());
    return strs.poll();
  }
}