package games.zoos;

public interface State {
    String getState();
    public void doAction(Context context);
}
