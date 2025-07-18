package funcional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class BankAccount {

    public static class Account {
        double amount;
        double interestRate;
        LocalDateTime duePayment;

       public Account (double amount, double interestRate, LocalDateTime duePayment){
           this.amount = amount;
           this.interestRate = interestRate;
           this.duePayment = duePayment;
       }

        public double getAmount() {
            return amount;
        }
    }


    public static List<Account> applyInterest(List<Account> accounts){
        return accounts.stream().filter(a-> LocalDateTime.now().isAfter(a.duePayment)).peek(a ->
               a.amount = a.amount * a.interestRate).sorted((a1,a2)->
                (int) (a1.amount - a2.amount)).collect(Collectors.toList());
    }

}
