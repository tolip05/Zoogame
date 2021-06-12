package games.zoos.animals;

import games.zoos.animals.Animal;

public class Horse extends Animal {
    private String state;
    private boolean eating;

    public Horse() {
        this.eating = false;
        this.state = "Idle";
    }

    @Override
    public String getState() {
        return this.state;
    }

    @Override
    public String toString() {
        return "Horse is ";
    }

    @Override
    public boolean isEating() {
        return eating;
    }

    @Override
    public void setState(String state) {
        this.state = state;
        if (!state.equals("eating")){
            eating = false;
        }
    }
}
