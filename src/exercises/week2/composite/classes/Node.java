package exercises.week2.composite.classes;

abstract class Node {
  // Properties
  private String name;
  private String address;

  // Constructor
  public Node(String name, String address) {
    this.name = name;
    this.address = address;
  }

  // Methods
  public String getName() {
    return name;
  }

  // Added setName for changing name of unit
  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }
}