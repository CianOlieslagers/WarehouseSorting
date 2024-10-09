import java.util.LinkedList;
import java.util.List;

public class Map {
    // The 2D map structure using LinkedList
    private List<List<Character>> map;

    // Constructor to initialize the map using a string input
    public Map(String mapString) {
        this.map = new LinkedList<>();
        parseMapString(mapString);
    }

    // Method to parse the input string and convert it into a 2D map
    private void parseMapString(String mapString) {
        String[] rows = mapString.split("\n");  // Split by new lines to get each row
        for (String row : rows) {
            List<Character> mapRow = new LinkedList<>();
            String[] columns = row.trim().split(" ");  // Split each row by spaces
            for (String col : columns) {
                mapRow.add(col.charAt(0));  // Add the character ('0' or '1') to the row
            }
            map.add(mapRow);  // Add the row to the map
        }
    }

    // Method to display the map
    public void display() {
        for (List<Character> row : map) {
            for (Character cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
