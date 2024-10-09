import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a Configuration object to initialize everything
        Configuration config = new Configuration();

        // Display all the initialized objects
        config.displayAll();

        // Modify a vehicle from the vehicles list
        List<Vehicle> vehicles = config.getVehicles();
        System.out.println("\nVehicle test:\n");
        vehicles.get(0).displayVehicle();

        // Modify a stack from the stacks list
        List<Stack> stacks = config.getStacks();
        System.out.println("\nStack test:\n");
        stacks.get(0).displayStack();

        // Display all objects after modification
        System.out.println("\nAfter modification:");
        config.displayAll();
    }
}

