package games.zoos.animals;


public class Cow extends Animal {
    private String state;

    public Cow() {
        this.state = "Idle";
    }

    @Override
    public String getState() {
        return this.state;
    }
    @Override
    public void setState(String state) {
        this.state = state;
    }
    @Override
    public String toString() {
        return "Cow is ";
    }
}
