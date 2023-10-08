import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number, guess;

        Scanner scanner = new Scanner(System.in);
        Random dice = new Random();

        do {
            number = dice.nextInt(6) + 1;

            System.out.print("Podaj liczbe: ");
            guess = scanner.nextInt();

            if (number == guess) {
                System.out.println("\nBrawo zgadłeś!");
            } else {
                System.out.println("\nTym razem się nie udało. Prawidłowa liczba to: " + number + ".");
            }

        } while (number != guess);
    }
}