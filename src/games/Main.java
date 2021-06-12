package games;

import games.engines.Engine;
import games.interpreters.CommandInterpreter;
import games.interpreters.Interpreter;
import games.io.ConsoleReader;
import games.io.ConsoleWriter;
import games.io.Reader;
import games.io.Writer;
import games.players.Observer;
import games.players.Player;
import games.players.Subject;
import games.zoos.*;
import games.zoos.animals.Animal;
import games.zoos.animals.Cow;
import games.zoos.animals.Horse;


public class Main {
    public static void main(String[] args) {
        Writer writer = new ConsoleWriter();
        Reader reader = new ConsoleReader();
        Subject subject = new Subject();
        Observer pesho = new Player(subject,"Pesho");
        Observer gosho = new Player(subject,"Gosho");
        Observer tosho = new Player(subject,"Tosho");
        Interpreter interpreter =
                new CommandInterpreter();
        Engine engine =
                new Engine(reader,writer,subject,interpreter);
        engine.run();

    }
}
