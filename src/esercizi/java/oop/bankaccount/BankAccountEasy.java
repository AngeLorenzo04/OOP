package oop.bankaccount;

public class BankAccountEasy extends AbstractBankAccount{


    protected BankAccountEasy(String IBAN, double balance){
        super(IBAN, balance,0.0,0.0);
    }

    @Override
    public double withdraw(double amount){
        if(amount > balance) return amount;
        this.balance -= amount;
        return Math.min(amount,balance);
    }

    @Override
    public double transfer(BankAccount other, double amount){
        if(!(other.getIBAN().substring(0,2).equals(IBAN.substring(0,2)))) return amount;
        other.deposit(amount);
        return withdraw(amount);
    }



}
