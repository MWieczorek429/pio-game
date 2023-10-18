import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int number, guess;

        Random dice = new Random();
        Player player = new Player();

        player.setName("Jan");

        do {
            number = dice.nextInt(6) + 1;
            System.out.println("Kostka: " + number);

            guess = player.guess();
            System.out.println("Gracz: " + guess);

            if (number == guess) {
                System.out.println("\nBrawo "+ player.getName() +" zgadłeś!");
            } else {
                System.out.println("\nTym razem się nie udało. Prawidłowa liczba to: " + number + ".");
            }

        } while (number != guess);
    }
}