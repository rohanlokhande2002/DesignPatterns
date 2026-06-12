package CreationalDesignPatterns.BuilderDP;

import CreationalDesignPatterns.BuilderDP.Computer;
public class BuilderMain {
    public static void main(String[] args) {
        Computer gamingPC = new Computer.ComputerBuilder("2TB SSD", "32GB").setGraphicsCardEnabled(true).setRGBEnabled(true).build();
        System.out.println(gamingPC);
    }
}
