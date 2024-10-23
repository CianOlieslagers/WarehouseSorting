public class Box {
    private int id;

    public Box(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Box{id='" + id + "'}";
    }
}
