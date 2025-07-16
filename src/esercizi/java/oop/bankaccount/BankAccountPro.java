package oop.bankaccount;

public class BankAccountPro extends AbstractBankAccount{


    /**
     * Construct a new BankAccount
     *
     * @param IBAN         the IBAN of the account
     * @param balance      the initial balance of the account
     * @param operationFee the fee to be applied to deposit and withdraw operations
     * @param interestRate the interest rate to be applied
     */
    protected BankAccountPro(String IBAN, double balance, double operationFee, double interestRate) {
        super(IBAN, balance, 0.0, interestRate);
    }

    /**
     * Deposit an amount on the account. Fees are applied.
     * @param amount the amount to be deposited
     */
    @Override
    public void deposit(double amount){
        super.deposit(amount);
        applyFee();
    }

    /**
     * Withdraw an amount from the account. Fees are applied.
     * @param amount the amount to be withdrawn
     * @return the amount withdrawn
     */
    @Override
    public double withdraw(double amount){
        applyFee();
        return super.withdraw(amount);
    }




}
