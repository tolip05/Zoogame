package games.zoos;

public class Eat implements State {
    @Override
    public void doAction(Context context) {
        context.setState(this);
    }
    @Override
    public String getState(){
        return "eating";
    }
}
