package exercises.week2.composite.classes;

import java.util.ArrayList;
import java.util.List;

public class UnitNode extends Node {
  // Properties
  private ArrayList<EmployeeNode> employees;
  private ArrayList<UnitNode> units = new ArrayList<>();

  // Constructor
  public UnitNode(String name, String address) {
    super(name, address);
    this.employees = new ArrayList<>();
  }

  // Methods
  public ArrayList<EmployeeNode> getEmployees() {
    return employees;
  }

  public void addEmployee(EmployeeNode employee) {
    employees.add(employee);
  }

  public void removeEmployee(EmployeeNode employee) {
    employees.remove(employee);
  }

  public ArrayList<UnitNode> getUnits() {
    return units;
  }

  public void addUnit(UnitNode unit) {
    units.add(unit);
  }

  public void removeUnit(UnitNode unit) {
    units.remove(unit);
  }

  public void getSalary(EmployeeNode employee) {
    employee.getSalary();
  }

  // Give raise to whole unit %-wise
  // example: HR.raiseSalaryforUnit(20);
  public void raiseSalaryForUnit(int amountPercent) {
    System.out.println("💢 Unit: " + this.getName() + " recieves a raise of: " + amountPercent + "%");
    for (EmployeeNode employee : employees) {
      double currentSalary = employee.getSalary();
      double raisedPercentage = (double) amountPercent / 100;
      double raiseAmount = currentSalary * raisedPercentage;
      double newSalary = currentSalary + raiseAmount;

      System.out.println(" 👨‍💻 " + employee.getName() + "'s salary raised from " + currentSalary + " to " + newSalary);
      employee.setSalary(newSalary);
    }
  }

  // Change name of UnitNode
  // example: HR.changeName("NewName");
  public void changeName(String newName) {
    if (newName != null) {
      super.setName(newName);
    }
  }

  // Get Units
  // example: company.printUnits();
  public void printUnits() {

    for (Node unit : units) {
      System.out.println("💢 " + unit.getName());
      if (unit instanceof UnitNode) {
        List<UnitNode> units = ((UnitNode) unit).getUnits();
        for (Node nestedUnit : units) {
          System.out.println(" 💢 " + nestedUnit.getName());
        }
      }
    }
  }

  // 3 WAYS TO GET EMPLOYEE LISTS
  // Get Employees
  // exmaple: HR.printEmployees();
  public void printEmployees() {
    System.out.println("💢 Unit: " + this.getName());
    for (Node employee : employees) {
      System.out.println(" 👨‍💻 " + employee.getName());
    }
  }

  // Get employees based on unit
  // example: company.printEmployeesBasedOnUnit(HR);
  public void printEmployeesBasedOnUnit(UnitNode unit) {
    List<EmployeeNode> employeeList = ((UnitNode) unit).getEmployees();
    System.out.println("💢 Unit: " +unit.getName());
    for(Node employee : employeeList) {
      System.out.println(" 👨‍💻 " + employee.getName());
    }
  }

  // (Extra) Print Unit and Employees attached to Unit
  // example: company.printUnitsAndEmployees();
  public void printUnitsAndEmployees() {
    for (Node unit : units) {
      System.out.println("💢 Unit: " + unit.getName());

      List<EmployeeNode> employees = ((UnitNode) unit).getEmployees();
      for (Node employee : employees) {
        System.out.println(" 👨‍💻 " + employee.getName());
      }

      if (unit instanceof UnitNode) {
        List<UnitNode> units = ((UnitNode) unit).getUnits();
        for (Node subUnit : units) {
          System.out.println("   💢 Unit: " + subUnit.getName());

          if (subUnit instanceof UnitNode) {
            List<EmployeeNode> employees2 = ((UnitNode) subUnit).getEmployees();
            for (Node employee : employees2) {
              System.out.println("    👨‍💻 " + employee.getName());
            }
          }
        }
      }
    }
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