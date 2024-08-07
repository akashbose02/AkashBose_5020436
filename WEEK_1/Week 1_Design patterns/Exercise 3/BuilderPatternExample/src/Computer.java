// Computer.java
public class Computer {
    // Required attributes
    private String CPU;
    private String RAM;
    private String storage;

    // Optional attributes
    private boolean graphicsCard;
    private boolean soundCard;

    // Private constructor
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.soundCard = builder.soundCard;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", storage=" + storage +
                ", graphicsCard=" + graphicsCard + ", soundCard=" + soundCard + "]";
    }

    // Static nested Builder class
    public static class Builder {
        // Required attributes
        private String CPU;
        private String RAM;
        private String storage;

        // Optional attributes
        private boolean graphicsCard;
        private boolean soundCard;

        public Builder(String CPU, String RAM, String storage) {
            this.CPU = CPU;
            this.RAM = RAM;
            this.storage = storage;
        }

        public Builder setGraphicsCard(boolean graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setSoundCard(boolean soundCard) {
            this.soundCard = soundCard;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
