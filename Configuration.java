import java.util.ArrayList;
import java.util.List;

public class Configuration {
    // Constants
    public static final int VEHICLE_CAPACITY = 4;
    public static final int VEHICLE_SPEED = 4;
    public static final int STACK_CAPACITY = 10;

    private Map map;
    private List<Vehicle> vehicles;
    private List<Stack> stacks;

    // Constructor to initialize the map and lists of vehicles and stacks based on the map
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

        // Parse the map and initialize vehicles and stacks
        parseMapForObjects(mapString);
    }

    // Parse the map string and initialize vehicles and stacks based on characters
    private void parseMapForObjects(String mapString) {
        String[] rows = mapString.split("\n");
        int vehicleId = 1;
        int stackId = 1;

        for (int y = 0; y < rows.length; y++) {
            String[] columns = rows[y].split(" ");
            for (int x = 0; x < columns.length; x++) {
                String cell = columns[x];

                // Check if the cell contains a vehicle ('&')
                if (cell.equals("&")) {
                    Coordinaat coordinaat = new Coordinaat(x, y); // x is column, y is row
                    vehicles.add(new Vehicle(vehicleId++, coordinaat, VEHICLE_CAPACITY, VEHICLE_SPEED));
                }

                // Check if the cell contains a stack ('$')
                else if (cell.equals("$")) {
                    Coordinaat coordinaat = new Coordinaat(x, y); // x is column, y is row
                    stacks.add(new Stack(stackId++, STACK_CAPACITY, coordinaat)); // capacity is set to 1
                }
            }
        }
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
            vehicle.displayLoad();
        }

        System.out.println("\nStacks:");
        for (Stack stack : stacks) {
            stack.displayStack();
        }
    }
}
