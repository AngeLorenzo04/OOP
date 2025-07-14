package oop.bankaccount;

public class AbstractBankAccount implements BankAccount {
    protected String IBAN;
    protected double balance;
    protected double operationFee;
    protected double interestRate;

    /**
     * Construct a new BankAccount
     * @param IBAN the IBAN of the account
     * @param balance the initial balance of the account
     * @param operationFee the fee to be applied to deposit and withdraw operations
     * @param interestRate the interest rate to be applied
     */
    protected AbstractBankAccount(String IBAN, double balance, double operationFee, double interestRate){
        this.setIBAN(IBAN);
        this.setBalance(balance);
        this.setInterestRate(interestRate);
        this.setInterestRate(interestRate);
    }

    /**
     * Trows an IllegalArgumentException if the passed value is negative.
     * @param value the value to be evaluated by the function.
     */
    protected void checkPositiveValue(double value){
        if(value < 0.0){
            throw new IllegalArgumentException("Valore negativo");
        }
    }

    @Override
    public String getIBAN(){
        return this.IBAN;
    }

    /**
     * Sets the IBAN. Only compliant formats are allowed.
     * An IBAN is valid if its length is comprised between [8, 34] and its first two chars are uppercase letters.
     * @param IBAN the IBAN to be set.
     */
    @Override
    public void setIBAN(String IBAN){
        BankAccount.checkIBAN(IBAN);
        this.IBAN = IBAN;
    }

    @Override
    public double getBalance(){
        return balance;
    }

    @Override
    public void setBalance(double balance){
        this.balance = balance;
    }

    @Override
    public double getOperationFee(){
        return operationFee;
    }

    /**
     * Sets operation fees. Only positive values are allowed.
     * @param operationFee the operation fee to be set
     */
    @Override
    public void setOperationFee(double operationFee){
        checkPositiveValue(operationFee);
        this.operationFee = operationFee;
    }
    public double getInterestRate(){
        return interestRate;
    }
    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }

    /**
     * Deposit an amount on the account. No fees are applied.
     * @param amount the amount to be deposited
     */
    public void deposit(double amount){
        checkPositiveValue(amount);
        balance += amount;
    }

    /**
     * Withdraw an amount from the account. No fees are applied.
     * @param amount the amount to be withdrawn
     * @return the amount withdrawn
     */
    public double withdraw(double amount){
        checkPositiveValue(amount);
        balance -= amount;
        return amount;
    }

    /**
     * Transfers an amount on a different account.
     * Fees are applied according to the specific rules of each account.
     * @param other the other bank account
     * @param amount the amount to be transferred
     * @return the amount transferred
     */
    public double transfer(BankAccount other, double amount){
        other.deposit(amount);
        this.withdraw(amount);
        return amount;
    }

    /**
     * Applies interests to the account
     */
    public void addInterest(){
        balance += balance * interestRate;
    }

    /**
     * Applies a fee to the account
     */
    public void applyFee() {
        balance = balance - operationFee;
    }
}
