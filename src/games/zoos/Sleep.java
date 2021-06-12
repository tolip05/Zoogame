package games.zoos;

public class Sleep implements State {
    @Override
    public void doAction(Context context) {
        context.setState(this);
    }
    @Override
    public String getState(){
        return "Sleeping";
    }
}
