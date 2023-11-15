import java.io.IOException;
import java.util.Random;

public class Player {

    public Player(){}

    public Player(String imie){
        setName(imie);
    }

    private Random brain = new Random();
    private String name = "Jan";

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if(name != null && !name.isEmpty()){
            this.name = name;
        }
        else {
            System.err.println("Nieprawidłowe imię.");
        }

    }

    public int guess(){
        return brain.nextInt(6) + 1;
    }
}
