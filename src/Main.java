import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int number, guess;

        Random dice = new Random();
        Player player = new Player();


        do {
            number = dice.nextInt(6) + 1;
            System.out.println("Kostka: " + number);

            guess = player.guess();
            System.out.println(player.getName() + " " + guess);

            if (number == guess) {
                System.out.println("\nBrawo "+ player.getName() +" zgadłeś!");
            } else {
                System.out.println("\nTym razem się nie udało. Prawidłowa liczba to: " + number + ".");
            }

        } while (number != guess);


    }

}