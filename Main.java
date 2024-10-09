public class Main {
    public static void main(String[] args) {
        // Create a map using the string representation
        String mapString =  "1 1 1 1 1 1 1 1 1 1 1 1 1\n" +
                            "1 0 $ 0 $ 0 $ 0 $ 0 $ 0 1\n" +
                            "1 0 0 0 0 0 0 0 0 0 0 $ 1\n" +
                            "1 0 0 0 0 0 0 0 0 0 0 0 1\n" +
                            "1 0 0 0 0 0 0 0 0 0 0 $ 1\n" +
                            "_ 0 0 0 0 0 0 0 0 0 0 0 1\n" +
                            "1 0 0 0 0 0 0 0 0 0 0 $ 1\n" +
                            "1 0 & 0 0 0 $ 0 $ 0 $ 0 1\n" +
                            "1 1 1 1 1 1 1 1 1 1 1 1 1";

        Map myMap = new Map(mapString);

        // Display the map
        myMap.display();
    }
}
