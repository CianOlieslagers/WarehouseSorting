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
    private List<Request> requests; // List to hold requests

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

        // Make the requests
        // R1: Request with ID=1 at Coordinaat(2,1) to Buffer (-1) at Coordinaat(4,1)
        Coordinaat pickupCoord1 = new Coordinaat(2, 1); // Stack ID 1
        Coordinaat deliveryCoord1 = new Coordinaat(4, 1); // Buffer (-1)
        Request request1 = new Request(1, pickupCoord1, deliveryCoord1, 1, 1);
        requests.add(request1);

        // Example 2: Request with Stack 2 at Coordinaat(4,1) to Buffer (-1) at Coordinaat(2,2)
        Coordinaat pickupCoord2 = new Coordinaat(4, 1); // Stack ID 2
        Coordinaat deliveryCoord2 = new Coordinaat(2, 2); // Buffer (-1)
        Request request2 = new Request(2, pickupCoord2, deliveryCoord2, 2, 1);
        requests.add(request2);
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
