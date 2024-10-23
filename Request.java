public class Request {
    private int id;            // Unique request ID
    private int targetBoxID;
    private int targetStackID;
    private int br;             // Associated box
    private int vehicleID;    // Associated vehicle for the request

    // Constructor to initialize all fields
    public Request(int id, Coordinaat srpu, Coordinaat srpl, int br, int vehicleID) {
        this.id = id;
        this.srpu = srpu;
        this.srpl = srpl;
        this.br = br;
        this.vehicleID = vehicleID;
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

    public int getBr() {
        return br;
    }

    public int getVehicleID() {
        return vehicleID;
    }

    // Display method to output the details of the request
    public void display() {
        System.out.println("Request ID: " + id);
        System.out.println("Pickup Location: " + srpu);
        System.out.println("Delivery Location: " + srpl);
        System.out.println("Associated Box: " + br);
        System.out.println("Assigned Vehicle ID: " + vehicleID);
    }
}

