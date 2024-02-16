package exercises.week3.builder.classes;

public class Builder {
  // Properties
  private PC pc = new PC();

  public Builder addCPU(String cpu) {
    //TODO validate CPU
    if (!cpu.toLowerCase().equals("intel")) {
      throw new PcIncompleteException("CPU has to be intel");
    }
    pc.setCpu(cpu);
    return this;
  }

  public Builder addGPU(String gpu) {
    //TODO validate GPU
    if (!gpu.toLowerCase().equals("nvidia")) {
      throw new PcIncompleteException("GPU has to be nvidia");
    }
    pc.setGpu(gpu);
    return this;
  }

  public Builder addMotherBoard(String motherBoard) {
    //TODO validate Motherboard
    if (!motherBoard.toLowerCase().equals("intel")) {
      throw new PcIncompleteException("Motherboard has to be intel");
    }
    pc.setMotherBoard(motherBoard);
    return this;
  }

  public Builder addRAM(String ram) {
    //TODO validate RAM
    if (!ram.toLowerCase().equals("gddr6")) {
      throw new PcIncompleteException("RAM needs GDDR6");
    }
    pc.setRam(ram);
    return this;
  }

  public PC build() {
    if (pc.getMotherBoard() == null) {
      throw new PcIncompleteException("Motherboard missing");
    } else if (pc.getRam() == null) {
      throw new PcIncompleteException("RAM missing");
    } else if (pc.getGpu() == null) {
      throw new PcIncompleteException("GPU missing");
    } else if (pc.getCpu() == null) {
      throw new PcIncompleteException("CPU missing");
    }
    return pc;
  }
}
