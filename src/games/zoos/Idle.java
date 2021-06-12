package games.zoos;

public class Idle implements State {
    @Override
    public void doAction(Context context) {
        context.setState(this);
    }
    @Override
    public String getState(){
        return "Idle";
    }
}
