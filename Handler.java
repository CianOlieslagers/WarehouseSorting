public class Handler {
    private Configuration config;
    private int boxCounter = 1;


    public Handler(Configuration config) {
        this.config = config;
    }

    public void moveVehicleAndLoadBox(int vehicleId, int stackId) throws Exception {
        Vehicle vehicle = config.getVehicleById(vehicleId);
        Stack stack = config.getStackById(stackId);

        if (vehicle != null && stack != null) {
            // Move vehicle to stack location
            vehicle.moveto(stack.getCoordinaat());
            // Load top box from the stack
            if (!stack.getBoxes().isEmpty()) {
                Box box = stack.topBox();
                vehicle.loadBox(box);
                stack.getBoxes().pop(); // Remove box from stack
            } else {
                System.out.println("Stack " + stackId + " is empty!");
            }
        }
    }

    // Move vehicle to stack and unload a box
    public void moveVehicleAndUnloadBox(int vehicleId, int stackId) throws Exception {
        Vehicle vehicle = config.getVehicleById(vehicleId);
        Stack stack = config.getStackById(stackId);

        if (vehicle != null && stack != null) {
            // Move vehicle to stack location
            vehicle.moveto(stack.getCoordinaat());
            // Unload box onto the stack
            Box box = vehicle.removeBox();
            stack.AddBox(box);
        }
    }
    public void moveVehicleToEntranceAndRetrieveBox(int vehicleId) throws Exception {
        Vehicle vehicle = config.getVehicleById(vehicleId);

        if (vehicle != null) {
            // Simulate vehicle moving to the entrance
            System.out.println("Vehicle " + vehicleId + " moved to the entrance.");

            // Create a new box (simulating that the entrance always has boxes)
            Box newBox = new Box(boxCounter++);

            // Load the box onto the vehicle
            vehicle.loadBox(newBox);
            System.out.println("Vehicle " + vehicleId + " retrieved Box " + newBox.getId() + " from the entrance.");
        } else {
            System.out.println("Vehicle with ID " + vehicleId + " not found!");
        }
    }





}
