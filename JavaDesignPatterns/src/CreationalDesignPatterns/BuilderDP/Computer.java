package CreationalDesignPatterns.BuilderDP;

public class Computer {

    private final String ram;
    private final String hdd;

    //optional
    private final boolean isGraphicsCardEnabled;
    private final boolean isRGBEnabled;

    //private constructor
    private Computer(ComputerBuilder builder){
        this.hdd = builder.hdd;
        this.ram = builder.ram;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isRGBEnabled = builder.isRGBEnabled;
    }

    //Getter
    public String getHdd(){
        return hdd;
    }

    public String getRam(){
        return ram;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isRGBEnabled() {
        return isRGBEnabled;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                ", isGraphicsCardEnabled=" + isGraphicsCardEnabled +
                ", isRGBEnabled=" + isRGBEnabled +
                '}';
    }


    public static class ComputerBuilder{

        private final String ram;
        private final String hdd;

        //optional
        private boolean isGraphicsCardEnabled;
        private boolean isRGBEnabled;

        public ComputerBuilder(String hdd, String ram){
            this.hdd = hdd;
            this.ram = ram;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled){
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setRGBEnabled(boolean isRGBEnabled){
            this.isRGBEnabled = isRGBEnabled;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
