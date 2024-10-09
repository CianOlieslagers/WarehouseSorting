public class Main {
    public static void main(String[] args) {
        // Create a map using the string representation
        String mapString =  "# # # # # # # # # # # # #\n" +
                            "# . $ . $ . $ . $ . $ . #\n" +
                            "# . . . . . . . . . . $ #\n" +
                            "# . . . . . . . . . . . #\n" +
                            "# . . . . . . . . . . $ #\n" +
                            "_ . . . . . . . . . . . #\n" +
                            "# . . . . . . . . . . $ #\n" +
                            "# . & . . . $ . $ . $ . #\n" +
                            "# # # # # # # # # # # # #";

        Map myMap = new Map(mapString);

        // Display the map
        myMap.display();
    }
}
