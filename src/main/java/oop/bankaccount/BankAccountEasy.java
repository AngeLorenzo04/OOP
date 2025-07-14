package oop.bankaccount;

public class BankAccountEasy extends AbstractBankAccount{


    /**
     * Construct a new BankAccount
     *
     * @param IBAN         the IBAN of the account
     * @param balance      the initial balance of the account
     * @param operationFee the fee to be applied to deposit and withdraw operations
     * @param interestRate the interest rate to be applied
     */
    protected BankAccountEasy(String IBAN, double balance, double operationFee, double interestRate) {
        super(IBAN, balance, 0.0, 0.0);
    }

    /**
     * Withdraws from the account a specified amount.
     * Amount are limited to the available balance.
     * @param amount the amount to be withdrawn
     * @return the amount actually withdrawn
     */
    @Override
    public double withdraw(double amount){
        double realAmount  = Math.min(balance,amount);
        this.balance -= realAmount;
        return  realAmount;
    }

    /**
     * Transfers and amount on a different account. Only same-country transfers are allowed.
     * @param other the other bank account
     * @param amount the amount to be transferred
     * @return the amount transferred
     */
    @Override
    public double transfer(BankAccount other, double amount){

        BankAccount.checkIBAN(other.getIBAN());

        String otherCountry = other.getIBAN().substring(0,2);
        String myCountry = this.getIBAN().substring(0,2);

        if(!otherCountry.equals(myCountry)){
            throw new IllegalArgumentException("Piano Easy non può effettuare transazioni al estero");
        }

        other.deposit(amount);

        return this.withdraw(amount);

    }

}
