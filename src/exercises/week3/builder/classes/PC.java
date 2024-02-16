package exercises.week3.builder.classes;

public class PC {
  // Properties
  private String cpu;
  private String gpu;
  private String motherBoard;
  private String ram;

  // Constructors
  public PC() {
  }

  public PC(String cpu, String gpu, String motherBoard, String ram) {
    this.cpu = cpu;
    this.gpu = gpu;
    this.motherBoard = motherBoard;
    this.ram = ram;
  }

  // Getters & Setters
  public String getCpu() {
    return cpu;
  }

  public void setCpu(String cpu) {
    this.cpu = cpu;
  }

  public String getGpu() {
    return gpu;
  }

  public void setGpu(String gpu) {
    this.gpu = gpu;
  }

  public String getMotherBoard() {
    return motherBoard;
  }

  public void setMotherBoard(String motherBoard) {
    this.motherBoard = motherBoard;
  }

  public String getRam() {
    return ram;
  }

  public void setRam(String ram) {
    this.ram = ram;
  }
}