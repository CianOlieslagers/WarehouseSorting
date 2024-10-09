public class Handler {
    private Configuration config;


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
            vehicle.removeBox();
        }
    }
}
