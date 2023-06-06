

public class Exercise9_7 {
    public static void main(String[] args) {
        Account account1 = new Account(1122, 20000);
        Account.setAnnualInterestRate(4.5);

        account1.withdraw(2500);
        account1.deposit(3000);

        System.out.println("Balance is " + account1.getBalance());
        System.out.println("Monthly Interest Rate is " + account1.getMonthlyInterest());
        System.out.println("This account is created at " + account1.getDateCreated());

        CheckingAccount checking = new CheckingAccount(1, 350);
        SavingAccount saving = new SavingAccount(2, 280);

        checking.withdraw(20);
        saving.withdraw(30);
        System.out.println("\n" + checking.getBalance());
        System.out.println(saving.getBalance());

    }


}

class Account {

    private int id;
    private double balance;
    /* Because Annual Interest Rate is the same for everybody we defined static */
    private static double annualInterestRate; 
    private java.util.Date dateCreated;

    public Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new java.util.Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }
    
    public double getBalance() {
        return balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterest() {
        return balance * (annualInterestRate /1200);
    }

    public void setId(int newId) {
        id = newId;
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    public static void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

}

/* These are for Exercise11_3 */
class CheckingAccount extends Account {

    /* This cannot be seen from super class Account */
    protected int overDraftLimit = 5000;

    public CheckingAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public String toString() {
        return "Checking";
    }
}

class SavingAccount extends Account {

    public SavingAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public String toString() {
        return "Saving";
    }
}
