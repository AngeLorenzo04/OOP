package oop.bankaccount;

public interface BankAccount {

   public  String getIBAN();

    public  void setIBAN(String IBAN);

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
     if (IBAN.length() < 8 || IBAN.length() > 34) {
      throw new IllegalArgumentException("Invalid length");
     }
     String countryCode = IBAN.substring(0, 2);
     if (!(Character.isLetter(countryCode.charAt(0)) && Character.isLetter(countryCode.charAt(1)))) {
      throw new IllegalArgumentException("Invalid country code");
     }
     if (!(Character.isUpperCase(countryCode.charAt(0)) && Character.isUpperCase(countryCode.charAt(1)))) {
      throw new IllegalArgumentException("Invalid country code");
     }
    }

}
