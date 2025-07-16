package warmup;

public class InterestsRate {
    public static void main(String[] args) {

        double balance = 1000;
        for(int i = 0; i < 3; i++){
            double percentage = balance * 5 /100;
            balance += percentage;
            System.out.println("balance year " + (i + 1) + " " + balance);
        }




    }



}
