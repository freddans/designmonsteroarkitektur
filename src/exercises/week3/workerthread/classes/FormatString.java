package exercises.week3.workerthread.classes;

public class FormatString {
  private String str;
  private double[] transaction;

  public FormatString(String str, double[] transaction) {
    this.str = str;
    this.transaction = transaction;
  }

  public String getStr() {
    return str;
  }

  public void setStr(String str) {
    this.str = str;
  }

  public double[] getTransaction() {
    return transaction;
  }

  public void setTransaction(double[] transaction) {
    this.transaction = transaction;
  }
}
