import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        // Create a Configuration object to initialize everything based on the map
        Configuration config = new Configuration();
        Handler handler = new Handler(config);


        System.out.println("\nMoving Vehicle 1 to Stack 1, loading a box, and unloading it on Stack 2:");
        handler.moveVehicleAndLoadBox(1, 1);  // Move vehicle 1 to stack 1 and load a box
        handler.moveVehicleAndUnloadBox(1, 2); // Move vehicle 1 to stack 2 and unload the box

        // Display all objects initialized within the configuration
        config.displayAll();




    }
}

