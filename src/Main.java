import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Game game = new Game();
        game.addPlayer(new PlayerComp("Stefan"));
        game.addPlayer(new PlayerComp("Adam"));
        game.addPlayer(new PlayerComp("Adam"));

        game.printPlayers();
        //game.removePlayer("Adam");
        game.printPlayers();

        for(int i = 0; i < 10; ++i)
            game.play();

        game.printStats();
    }

}