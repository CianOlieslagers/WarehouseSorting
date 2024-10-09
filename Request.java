public class Request {
    private int id;            // Unique request ID
    private Coordinaat srpu;      // Pickup location (buffer point or storage stack)
    private Coordinaat srpl;      // Place/delivery location (buffer point or storage stack)
    private Box br;             // Associated box
    private Vehicle vehicle;    // Associated vehicle for the request

    // Constructor to initialize all fields
    public Request(int id, Coordinaat srpu, Coordinaat srpl, Box br, Vehicle vehicle) {
        this.id = id;
        this.srpu = srpu;
        this.srpl = srpl;
        this.br = br;
        this.vehicle = vehicle;
    }

    // Getters for all fields
    public int getId() {
        return id;
    }

    public Coordinaat getSrpu() {
        return srpu;
    }

    public Coordinaat getSrpl() {
        return srpl;
    }

    public Box getBr() {
        return br;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    // Display method to output the details of the request
    public void display() {
        System.out.println("Request ID: " + id);
        System.out.println("Pickup Location: " + srpu);
        System.out.println("Delivery Location: " + srpl);
        System.out.println("Associated Box: " + br);
        System.out.println("Assigned Vehicle ID: " + vehicle.getId());
    }
}

