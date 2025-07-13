package oop.basics;

/**
 * Classe BanckAccount
 */
public class BankAccount {

    private double balace;

    /**
     * Crea un BanckAccount con un bilancio iniziale
     * @param balace un double che rappresenta il bilancio
     */
    public BankAccount(double balace) {
        this.balace = balace;
    }

    /**
     * Crea un BanckAccount vuoto
     */
    public BankAccount(){
        this.balace = 0;
    }

    /**
     * Restituisce il bilancio del BanckAccount
     * @return Double bilancio
     */
    public double getBalace() {
        return balace;
    }

    /**
     * Deposito di un ammonto
     * @param ammount Double che rappresenta l'ammonto depositato
     */
    public void deposit(double ammount){
        if(ammount < 0){
            throw new IllegalArgumentException("Ammonto non valido");
        }
        this.balace += ammount;
    }

    public  void whitdraw(double ammount){
        if(ammount < 0 || ammount > this.balace){
            throw  new IllegalArgumentException("Ammonto non valido");
        }
        this.balace -= ammount;
    }


    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        BankAccount ba1 = new BankAccount(10);

        System.out.println("Account: ba Balance: " + Double.toString(ba.getBalace()));
        System.out.println("Account: ba1 Balance: " + Double.toString(ba1.getBalace()));

        ba.deposit(10);
        ba1.deposit(10);
        System.out.println("Account: ba Balance: " + Double.toString(ba.getBalace()));
        System.out.println("Account: ba1 Balance: " + Double.toString(ba1.getBalace()));

        ba.whitdraw(23);
        ba1.whitdraw(23);
        System.out.println("Account: ba Balance: " + Double.toString(ba.getBalace()));
        System.out.println("Account: ba1 Balance: " + Double.toString(ba1.getBalace()));




    }

}
