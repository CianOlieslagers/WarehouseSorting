public class Stack {
    private int capacity;
    private java.util.Stack<Box> boxes;
    private int location;
    private int IdStack;


    public Stack(int capacity, java.util.Stack<Box> boxes, int location, int idStack) {
        this.capacity = capacity;
        this.boxes = boxes;
        this.location = location;
        IdStack = idStack;
    }

    // Getter en Setter
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public java.util.Stack<Box> getBoxes() {
        return boxes;
    }

    public void setBoxes(java.util.Stack<Box> boxes) {
        this.boxes = boxes;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }



}
