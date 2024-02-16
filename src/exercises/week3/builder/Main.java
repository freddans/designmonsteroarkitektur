package exercises.week3.builder;

import exercises.week3.builder.classes.Builder;
import exercises.week3.builder.classes.PC;

public class Main {
  public static void main(String[] args) {
    Builder builder = new Builder();
    PC pc = builder
        .addCPU("intel")
        .addGPU("nvidia")
        .addMotherBoard("intel")
        .addRAM("GDDR6")
        .build();

    System.out.println("PC created: " + pc.getCpu() + ", " + pc.getGpu() + ", " + pc.getMotherBoard() + ", " + pc.getRam() + ".");

  }
}