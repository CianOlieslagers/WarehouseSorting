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
        int rows = map.size();
        int cols = map.get(0).size();

        // Print column headers (0, 1, 2, ..., 10, 11, ...)
        System.out.print("   "); // Extra space for row numbers (and alignment for double digits)
        for (int col = 0; col < cols; col++) {
            if (col < 10) {
                System.out.print(col + "  "); // Add extra space for single-digit columns
            } else {
                System.out.print(col + " "); // Add normal space for double-digit columns
            }
        }
        System.out.println();

        // Print each row with row numbers
        for (int row = 0; row < rows; row++) {
            if (row < 10) {
                System.out.print(row + "  "); // Add extra space for single-digit rows
            } else {
                System.out.print(row + " "); // Add normal space for double-digit rows
            }

            for (Character cell : map.get(row)) {
                System.out.print(cell + "  "); // Two spaces between each cell for proper alignment
            }
            System.out.println();
        }
    }


}
