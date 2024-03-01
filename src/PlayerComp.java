import java.util.Random;
import java.util.Scanner;

public class PlayerComp extends Player {

    private Random brain = new Random();

    public PlayerComp () {

    }

    public PlayerComp(String imie) {
        super(imie);
    }


    @Override
    public int guess(){
        return brain.nextInt(6) + 1;
    }
}
