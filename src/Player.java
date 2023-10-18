import java.util.Random;

public class Player {

    private Random brain = new Random();
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int guess(){
        return brain.nextInt(6) + 1;
    }
}
