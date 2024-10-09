import java.util.ArrayList;
import java.util.List;

public class Configuration {
    private Map map;
    private List<Vehicle> vehicles;
    private List<Stack> stacks;

    // Constructor to initialize the map and lists of vehicles and stacks
    public Configuration() {
        // Initialize the map
        String mapString =  "# # # # # # # # # # # # #\n" +
                            "# . $ . $ . $ . $ . $ . #\n" +
                            "# . . . . . . . . . . $ #\n" +
                            "# . . . . . . . . . . . #\n" +
                            "# . . . . . . . . . . $ #\n" +
                            "_ . . . . . . . . . . . #\n" +
                            "# . . . . . . . . . . $ #\n" +
                            "# . & . . . $ . $ . $ . #\n" +
                            "# # # # # # # # # # # # #";
        this.map = new Map(mapString);

        // Initialize the lists of vehicles and stacks
        this.vehicles = new ArrayList<>();
        this.stacks = new ArrayList<>();

        // Add some default vehicles and stacks to the lists
        vehicles.add(new Vehicle("Car", 120));
        vehicles.add(new Vehicle("Truck", 80));

        stacks.add(new Stack(10));
        stacks.add(new Stack(20));
    }

    // Getter method to access the map
    public Map getMap() {
        return map;
    }

    // Getter methods to access the lists of vehicles and stacks
    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public List<Stack> getStacks() {
        return stacks;
    }

    // Method to display all objects (map, vehicles, and stacks)
    public void displayAll() {
        System.out.println("Map:");
        map.display();

        System.out.println("\nVehicles:");
        for (Vehicle vehicle : vehicles) {
            vehicle.display();
        }

        System.out.println("\nStacks:");
        for (Stack stack : stacks) {
            stack.display();
        }
    }
}
