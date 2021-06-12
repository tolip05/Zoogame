package games.zoos.animals;

import java.util.AbstractSequentialList;

public abstract class Animal {
    public abstract String getState();
    public abstract void setState(String state);
    public boolean isEating(){
        return false;
    };
}
