package oop.bankaccount;

public interface BankAccount {
    
    
    public String getIBAN();
    public void setIBAN(String IBAN);
    public double getBalance();
    public void setBalance(double balance);
    public double getOperationFee();
    public void setOperationFee(double operationFee);
    public double getInterestRate();
    public void setInterestRate(double interestRate);
    public void deposit(double amount);
    public double withdraw(double amount);
    public double transfer(BankAccount other, double amount);
    public void addInterest();
    public void applyFee();
    public static void checkIBAN(String IBAN){
        if(IBAN.length() > 24 || IBAN.length() < 8){
            throw new IllegalArgumentException("IBAN non valido");
        }
    }
    
}
