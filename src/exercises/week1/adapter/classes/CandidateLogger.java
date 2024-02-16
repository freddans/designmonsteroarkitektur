package exercises.week1.adapter.classes;

import exercises.week1.adapter.Interfaces.BestLogger;

import java.util.Date;

public class CandidateLogger implements BestLogger {
  @Override
  public void log(String str, Date date) {
    System.out.println("FROM: Candidate Logger");
    System.out.println("str: " + str + ", date: " + date);
  }
}