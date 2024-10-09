
public class Stack {
    private int capacity;
    private java.util.Stack<Box> boxes;
    private Coordinaat coordinaat;
    private int IdStack;


    public Stack(int capacity, Coordinaat coordinaat, int idStack) {
        this.capacity = capacity;
        this.boxes = new java.util.Stack<Box>();
        this.coordinaat = coordinaat;
        this.IdStack = idStack;
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

    public Coordinaat getCoordinaat() {
        return coordinaat;
    }

    public void setCoordinaat(Coordinaat coordinaat) {
        this.coordinaat = coordinaat;
    }

    public int getIdStack() {
        return IdStack;
    }

    public void setIdStack(int idStack) {
        IdStack = idStack;
    }

    // Stack funtionaliteit

    public void addBox(Box box)  {
        boxes.push(box);
        System.out.println("Box " + box.getId() + " added to stack at location " + coordinaat);
    }

    public void AddBox(Box box){
        boxes.push(box);
    }

    public Box topBox(){
        return boxes.peek();
    }
    //

    public void displayStack(){
        System.out.println("Stack at location: "+ coordinaat +" with id: "+ IdStack + " contains boxes: "+ boxes );
    }
}
