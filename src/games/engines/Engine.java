package games.engines;

import games.interpreters.Interpreter;
import games.io.Reader;
import games.io.Writer;
import games.players.Subject;
import games.zoos.*;
import games.zoos.animals.Animal;
import games.zoos.animals.Cow;
import games.zoos.animals.Horse;

import java.io.IOException;
import java.util.Arrays;

public class Engine implements Runnable {
    private Reader reader;
    private Writer writer;
    private State state;
    private Interpreter interpreter;
    private Subject subject;

    public Engine(Reader reader, Writer writer,
                  Subject subject,
                  Interpreter interpreter) {
        this.reader = reader;
        this.writer = writer;
        this.subject = subject;
        this.interpreter = interpreter;
    }

    @Override
    public void run() {
        Animal cow = new Cow();
        Animal horse = new Horse();
        State idle = new Idle();
        State eat = new Eat();
        State sleep = new Sleep();
        Context context = new Context();
        this.writer.write("Enter animal and state!");
        try {
            String line = this.reader.read();
            while (!line.equals("Stop")) {
                String[] inputs =  Arrays.stream(line.split(" ")).toArray(String[]::new);

                String state = inputs[1];
                String animal = inputs[0];
                Animal curentAnimal = horse;
                if (animal.equals("cow")) {
                    curentAnimal = cow;
                }
                switch (state) {
                    case "idle":
                        this.state = idle;
                        this.interpreter.interpretCommand(context,this.state,curentAnimal);
                        break;
                    case "eat":
                        this.state = eat;
                        this.interpreter.interpretCommand(context,this.state,curentAnimal);
                        if(curentAnimal == horse){
                            this.subject.notifyAllObservers();
                        }
                        break;
                    case "sleep":
                        this.state = sleep;
                        this.interpreter.interpretCommand(context,this.state,curentAnimal);
                        break;
                    default:
                        break;
                }
                this.writer.write("Enter animal and state!");
                line = this.reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
