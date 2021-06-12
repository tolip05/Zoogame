package games.interpreters;

import games.zoos.Context;
import games.zoos.State;
import games.zoos.animals.Animal;

public interface Interpreter {
    void interpretCommand(Context context, State state, Animal animal);
}
