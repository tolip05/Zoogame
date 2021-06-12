package games.players;

public class Player extends Observer {

    private String name;

    public Player(Subject subject,String name){
        this.subject = subject;
        this.subject.attach(this);
        this.name = name;
    }
    @Override
    public void update() {
        System.out.println(this.name + " was notifie that Horses starts eating!!!");
    }
}
