import java.util.ArrayList;

public class Vehicle {
    private int id;
    private Coordinaat coordinaat;
    private int capacity;
    private ArrayList<Box> load;


    // Constructor
    public Vehicle(int id, Coordinaat coordinaat, int capacity) {
        this.id = id;
        this.coordinaat = coordinaat;
        this.capacity = capacity;
        this.load = new ArrayList<Box>();
    }

    // Getter en Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Coordinaat getCoordinaat() {
        return coordinaat;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Box> getLoad() {
        return load;
    }

    public void setLoad(ArrayList<Box> load) {
        this.load = load;
    }

    // Functies voor vehicle
    public void moveto(Coordinaat coordinaat){
        System.out.println();
        this.coordinaat = coordinaat;
    }

    public void loadBox(Box box) throws Exception{
        if (load.size() >= capacity){
            throw new Exception("Vehicle is at full capacity");
        }
        load.add(box);
        System.out.println("Vehicle with id: "+ id + " loadedBox with Id: "+ box.getId());
    }


    public void removeBox() throws Exception{
        if(load.isEmpty() ){
            throw new Exception("Vehicle is empty");
        }

        Box box = load.remove(load.size()-1);
        System.out.println("Vehicle with id: "+ id + " Removed Box with Id: "+ box.getId());

    }

    public void displayLoad(){
        System.out.println("Vehicle with id: " + id + ", at location (" + coordinaat.x + "; " + coordinaat.y + "), is carrying: "+ load);
    }




}
