package warmup;

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class GuessNumber {
    public static void guessNumber() {

        Scanner scanner = new Scanner(System.in);
        RandomGenerator randomGenerator = RandomGenerator.getDefault();

        while (true) {

            int result = randomGenerator.nextInt();
            System.out.println("secondo te, che numero sto pensando?");
            int answer = scanner.nextInt();

            if (answer != result) {
                System.out.println("AHHAHAHH HAI SBAGLIATO NABBO RIPROVA");
            } else {

                if (result != 0) {
                    System.out.println("GOAT ASSOLUTO HAI INDOVINATO, continuiamo...");
                } else {

                    System.out.println("GOAT ASSOLUTO HAI INDOVINATO, alla prossima");
                    break;
                }

            }


        }
    }


    public static void main(String[] args) {
        guessNumber();
    }
}
