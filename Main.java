import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        // Create a Configuration object to initialize everything based on the map
        Configuration config = new Configuration();
        Handler handler = new Handler(config);




        handler.moveVehicleToEntranceAndRetrieveBox(1);
        handler.moveVehicleAndUnloadBox(1, 2); // Move vehicle 1 to stack 2 and unload the box
        handler.moveVehicleAndLoadBox(1,2);
        handler.moveVehicleAndUnloadBox(1,4);

        // Display all objects initialized within the configuration
        config.displayAll();




    }
}

