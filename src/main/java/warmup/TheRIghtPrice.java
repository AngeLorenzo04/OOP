package warmup;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class TheRIghtPrice {

    static Scanner scanner = new Scanner(System.in);
    static RandomGenerator randomGenerator = RandomGenerator.getDefault();
    public static void theRightPrice (int p1, int p2) {

        int target = randomGenerator.nextInt(100);
        int delta1 = Math.abs(target - p1);
        int delta2 = Math.abs(target - p2);

        System.out.println("delta1 " + delta1);
        System.out.println("delta2 " + delta2);

        if(delta2 > delta1){
            System.out.println("vince p1 -> " + p1 );
            return;
        }

        System.out.println("vince p2 -> " + p2   );

    }

    public static void main(String[] args) {
        System.out.println("Player one");
        int p1 = scanner.nextInt();
        System.out.println("Player two");
        int p2 = scanner.nextInt();
        theRightPrice(p1,p2);
    }
}
