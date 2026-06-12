package CreationalDesignPatterns.BuilderDP;
import CreationalDesignPatterns.BuilderDP.Computer;

//Builder pattern is used to make the object creation simple
// If you notice when we create the class then n-number of fields then
// if user wants to initialize the object with some specific values then we need to
// many constructor with multiple combination so that work is simplified by builder patter


public class BuilderMain {
    public static void main(String[] args) {
        Computer gamingPC = new Computer.ComputerBuilder("2TB SSD", "32GB")
                .setGraphicsCardEnabled(true)
                .setRGBEnabled(true)
                .build();

        System.out.println(gamingPC);
    }
}
