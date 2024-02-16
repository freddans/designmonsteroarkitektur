package exercises.week2.composite;

import exercises.week2.composite.classes.EmployeeNode;
import exercises.week2.composite.classes.UnitNode;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // Test
    testMethods();

    System.out.println();

    // Run program
    run();
  }

  public static void run() {
    // Company
    UnitNode company = new UnitNode("Company A", "Prästgårdsängen 8");

    // Units
    UnitNode IT = new UnitNode("IT", "Prästgårdsängen 8");
    UnitNode ITsupport = new UnitNode("IT Support", "Prästgårdsängen 8");
    UnitNode HR = new UnitNode("HR", "Prästgårdsängen 8");

    // Add sub unit IT-Support into IT
    IT.addUnit(ITsupport);

    // Add units into company
    company.addUnit(IT);
    company.addUnit(HR);

    // Creating IT employees
    EmployeeNode employee1 = new EmployeeNode("Hampus", "Vitklövern 15", 38_000);
    EmployeeNode employee2 = new EmployeeNode("Johanna", "Marklandsgatan 22", 41_000);
    EmployeeNode employee3 = new EmployeeNode("Patrik", "Solängen 1", 39_000);
    // Creating IT-Support employees
    EmployeeNode employee4 = new EmployeeNode("Alice", "Vasastan 8", 19_000);
    EmployeeNode employee5 = new EmployeeNode("Marcus", "Stampgatan 85", 17_000);
    // Creating HR employees
    EmployeeNode employee6 = new EmployeeNode("Oscar", "Hjuviksdal 63", 35_000);
    EmployeeNode employee7 = new EmployeeNode("Katrin", "Risåsgatan 94", 28_000);
    EmployeeNode employee8 = new EmployeeNode("Sebastian", "Solrosgatan 14", 33_000);

    // Putting employees into their respective unit
    IT.addEmployee(employee1);
    IT.addEmployee(employee2);
    IT.addEmployee(employee3);
    ITsupport.addEmployee(employee4);
    ITsupport.addEmployee(employee5);
    HR.addEmployee(employee6);
    HR.addEmployee(employee7);
    HR.addEmployee(employee8);


    // PROGRAM MENU STARTS HERE
    Scanner input = new Scanner(System.in);
    while (true) {
      System.out.println("MENY");
      System.out.println("1: Change name of Unit");
      System.out.println("2: Get Employees based on Unit");
      System.out.println("3: Raise salary for all Employees tied to specific Unit");
      System.out.println("0: Quit program");
      System.out.print("Input: ");
      int firstChoice = input.nextInt();

      switch (firstChoice) {
        case 1:
          company.printUnits();
          System.out.print("Input: ");
          int changeNameInput = input.nextInt();
          input.nextLine();

          // Change name of unit
          UnitNode selectedUnit = null;
          switch (changeNameInput) {
            case 1:
              selectedUnit = IT;
              break;
            case 2:
              selectedUnit = ITsupport;
              break;
            case 3:
              selectedUnit = HR;
              break;
            default:
              System.out.println("Input 1-3");
              continue; // Go back to the start of the loop
          }

          System.out.println("Change name of Unit: " + selectedUnit.getName());
          System.out.print("New name: ");
          String newUnitName = input.nextLine();
          System.out.println("Changed name of Unit: " + selectedUnit.getName() + " to " + newUnitName);
          selectedUnit.changeName(newUnitName);
          break;

        case 2:
          company.printUnits();
          System.out.print("Input: ");
          int employeeListInput = input.nextInt();

          UnitNode selectedUnitEmployeeList = null;
          switch (employeeListInput) {
            case 1:
              selectedUnitEmployeeList = IT;
              break;
            case 2:
              selectedUnitEmployeeList = ITsupport;
              break;
            case 3:
              selectedUnitEmployeeList = HR;
              break;
            default:
              System.out.println("Input 1-3");
              continue; // Go back to the start of the loop
          }

          selectedUnitEmployeeList.printEmployees();
          break;

        case 3:
          company.printUnits();
          System.out.print("Input: ");
          int raisedSalaryInput = input.nextInt();

          UnitNode selectedUnitForRaise = null;
          switch (raisedSalaryInput) {
            case 1:
              selectedUnitForRaise = IT;
              break;
            case 2:
              selectedUnitForRaise = ITsupport;
              break;
            case 3:
              selectedUnitForRaise = HR;
              break;
            default:
              System.out.println("Input 1-3");
              continue; // Go back to the start of the loop
          }

          System.out.println("Input % of raise");
          System.out.print("Input: ");
          int raise = input.nextInt();
          selectedUnitForRaise.raiseSalaryForUnit(raise);
          break;

        case 0:
          System.out.println("Quitting program");
          System.exit(0); // Exit the program
          break;

        default:
          System.out.println("Invalid input");
          continue; // Go back to the start of the loop
      }
    }
  }
  public static void testMethods() {
    // Company
    UnitNode company = new UnitNode("Company A", "Prästgårdsängen 8");

    // Units
    UnitNode IT = new UnitNode("IT", "Prästgårdsängen 8");
    UnitNode ITsupport = new UnitNode("IT Support", "Prästgårdsängen 8");
    UnitNode HR = new UnitNode("HR", "Prästgårdsängen 8");

    // Add sub unit IT-Support into IT
    IT.addUnit(ITsupport);

    // Add units into company
    company.addUnit(IT);
    company.addUnit(HR);

    // Creating IT employees
    EmployeeNode employee1 = new EmployeeNode("Hampus", "Vitklövern 15", 38_000);
    EmployeeNode employee2 = new EmployeeNode("Johanna", "Marklandsgatan 22", 41_000);
    EmployeeNode employee3 = new EmployeeNode("Patrik", "Solängen 1", 39_000);
    // Creating IT-Support employees
    EmployeeNode employee4 = new EmployeeNode("Alice", "Vasastan 8", 19_000);
    EmployeeNode employee5 = new EmployeeNode("Marcus", "Stampgatan 85", 17_000);
    // Creating HR employees
    EmployeeNode employee6 = new EmployeeNode("Oscar", "Hjuviksdal 63", 35_000);
    EmployeeNode employee7 = new EmployeeNode("Katrin", "Risåsgatan 94", 28_000);
    EmployeeNode employee8 = new EmployeeNode("Sebastian", "Solrosgatan 14", 33_000);

    // Putting employees into their respective unit
    IT.addEmployee(employee1);
    IT.addEmployee(employee2);
    IT.addEmployee(employee3);
    ITsupport.addEmployee(employee4);
    ITsupport.addEmployee(employee5);
    HR.addEmployee(employee6);
    HR.addEmployee(employee7);
    HR.addEmployee(employee8);

    // See all units
    System.out.println("All units under " + company.getName());
    company.printUnits();

    System.out.println();

    System.out.println("Printing Units with Employees");
    company.printUnitsAndEmployees();

    System.out.println();

    // PRINTING EMPLOYEES BASED ON UNIT
    System.out.println("Employees based on unit");
    company.printEmployeesBasedOnUnit(HR);

    System.out.println();

    System.out.println("Other way to print based on unit");
    HR.printEmployees();

    System.out.println();

    // CHANGING NAME OF UNIT
    System.out.println("Current name: " + HR.getName());
    HR.changeName("zz");
    System.out.println("New name: " + HR.getName());

    System.out.println();

    // Raising all employees salaries in specific unit
    HR.raiseSalaryForUnit(40);
  }
}