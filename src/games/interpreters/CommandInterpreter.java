package games.interpreters;

import games.zoos.Context;
import games.zoos.State;
import games.zoos.animals.Animal;

public class CommandInterpreter implements Interpreter {
private State curentState;
private Animal animal;
    @Override
    public void interpretCommand(Context context, State state, Animal animal) {
        this.curentState = state;
        this.animal = animal;
        this.curentState.doAction(context);
        this.animal.setState(this.curentState.toString());
        System.out.println(this.animal.toString() + context.getState().getState());
    }
}
