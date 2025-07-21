package oop.bankaccount;

public abstract class AbstractBankAccount implements BankAccount {
    
    protected   String IBAN;
    protected   double balance;
    protected   double operationFee;
    protected   double interestRate;
    protected   AbstractBankAccount(String IBAN, double balance, double operationFee, double interestRate){
        this.IBAN = IBAN;
        this.balance = balance;
        this.operationFee = operationFee;
        this.interestRate = interestRate;
    }
    protected  void checkPositiveValue(double value){
        if(value < 0.0){
            throw new IllegalArgumentException("Negative values are not allowed for this operation");
        }
    }
    public String getIBAN(){
        return IBAN;
    }
    public void setIBAN(String IBAN){
        this.IBAN = IBAN;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getOperationFee(){
        return operationFee;
    }
    public void setOperationFee(double operationFee){
        this.operationFee = operationFee;
    }
    public double getInterestRate(){
        return interestRate;
    }
    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }
    public void deposit(double amount){
        this.balance += amount;
    }
    public double withdraw(double amount){
        this.balance -= amount;
        return amount;
    }
    public double transfer(BankAccount other, double amount){
        this.balance -= amount;
        other.deposit(amount);
        return amount;
    }
    public void addInterest(){
        this.balance = balance + balance * interestRate;
    }
    public void applyFee(){
        this.balance = this.balance - operationFee;
    }
    
}
