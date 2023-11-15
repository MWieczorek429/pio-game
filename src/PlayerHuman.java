import java.util.Scanner;

public class PlayerHuman extends Player {

    private Scanner scanner = new Scanner(System.in);

    public PlayerHuman() {

    }

    public PlayerHuman(String imie) {
        super(imie);
    }



    public int guess(){
        System.out.print("Wpisz liczbę (1-6): ");
        return scanner.nextInt();
    }
}
