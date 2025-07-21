package oop.bankaccount;

public class BankAccountPro extends AbstractBankAccount {

    protected BankAccountPro(String IBAN, double balance) {
        super(IBAN, balance, 0.2, 1);
    }
    @Override
    public void deposit(double amount){
        applyFee();
        this.balance += amount;
    }

    public double withdraw(double amount){
        applyFee();
        this.balance -= amount;
        return amount;
    }

}
