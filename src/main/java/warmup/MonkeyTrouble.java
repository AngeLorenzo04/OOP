package warmup;
import java.util.Scanner;
public class MonkeyTrouble {

    static Scanner scanner = new Scanner(System.in);

    public static void monkeyTrouble(boolean aSmiling, boolean bSmiling){
        if(aSmiling && bSmiling){
            System.out.println("siamo in pericolo");
            return;
        }

        System.out.println("SAFE SAFE SAFE");
    }


    public static void main(String[] args) {
        System.out.println("scimmia a sorride?");
        boolean aSmiling =  scanner.nextBoolean();
        System.out.println("scimmia b sorride?");
        boolean bSmiling =  scanner.nextBoolean();
        monkeyTrouble(aSmiling,bSmiling);

    }
}
