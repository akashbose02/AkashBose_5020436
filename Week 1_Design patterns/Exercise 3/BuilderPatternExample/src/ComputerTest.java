// ComputerTest.java
public class ComputerTest {
    public static void main(String[] args) {
        // Create a basic computer
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB", "512GB SSD").build();
        System.out.println(basicComputer);

        // Create a computer with a graphics card
        Computer gamingComputer = new Computer.Builder("Intel i7", "16GB", "1TB SSD")
                .setGraphicsCard(true).build();
        System.out.println(gamingComputer);

        // Create a computer with a sound card and a graphics card
        Computer multimediaComputer = new Computer.Builder("AMD Ryzen 5", "32GB", "2TB HDD")
                .setGraphicsCard(true).setSoundCard(true).build();
        System.out.println(multimediaComputer);
    }
}

