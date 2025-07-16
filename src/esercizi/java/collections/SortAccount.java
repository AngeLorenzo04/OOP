package collections;


import java.time.LocalDate;
import java.util.List;

public class SortAccount {

    /**
     * classe account
     */
    public static class Account {
        double amount;
        double interestRate;
        LocalDate duePayment;
        public Account(double amount, double interestRate, LocalDate duePayment){
            this.amount = amount;
            this.interestRate = interestRate;
            this.duePayment = duePayment;
        }
        public double getAmount() {
            return amount;
        }

        public double getInterestRate() {
            return interestRate;
        }

        public LocalDate getDuePayment() {
            return duePayment;
        }
    }


    public static void sortByAmount(List<Account> accounts){
        accounts.sort((account1, account2) -> Double.compare(account1.getAmount(),account2.getAmount()));
    }
    public static void sortByInterestRate(List<Account> accounts){
        accounts.sort((Account account1,Account account2) -> Double.compare(account1.getInterestRate(),account2.getInterestRate()));
    }
    public static void sortByDuePayment(List<Account> accounts){
        accounts.sort((account1, account2) -> account1.duePayment.compareTo(account2.duePayment) );
    }


}
