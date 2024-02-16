package exercises.week2.composite.classes;

public class EmployeeNode extends Node {
  // Properties
  public double salary;

  // Constructor
  public EmployeeNode(String name, String address, double salary) {
    super(name, address);
    this.salary = salary;
  }

  // Methods
  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  @Override
  public String getName() {
    return super.getName();
  }

  @Override
  public String getAddress() {
    return super.getAddress();
  }
}