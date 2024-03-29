public class ATM extends Account {
  
    private Account[] accounts = new Account[5];

    public ATM() {
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account();
            accounts[i].setId(i);
            accounts[i].setBalance(500);
        }

        boolean process = true;

        continueATM:while (process) {
            System.out.print("Enter an id: ");
            id = input.nextInt();
            System.out.print(id);
            if (id == 0){
                System.out.print("\nGood bye");
                process = false;
                break;
            }
            if (id < 1 || id > 5) {
                System.out.println("\nPlease enter a correct id");
                continue;
            }

            while (process) {
                int choice = getAChoice();

                switch (choice) {
                case 1:
                    System.out.print("The balance is " + accounts[id].getBalance());
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:          
                    continue continueATM; 
                }
            }
        }
    }

    private static java.util.Scanner input = new java.util.Scanner(System.in);

    int id;

    public static void main(String[] args) {
        new ATM();
    }

    public void withdraw() {
        System.out.print("Enter a positive amount to withdraw: ");
        int amount = input.nextInt();
        System.out.print(amount);
        if (amount <= accounts[id].getBalance()) {
            accounts[id].withdraw(amount);
        }
        else {
            System.out.print("The amount is too large, ignored");
        }
    }

    public void deposit() {
        System.out.print("Enter a positive amount to deposit: ");
        int amount = input.nextInt();
        System.out.print(amount);
        if (amount >= 0) {
            accounts[id].deposit(amount);
        }
        else {
        System.out.print("The amount is negative, ignored");
        }
    }

    public int getAChoice() {
        int choice;

        while (true) {
            System.out.println("\nMain menu");
            System.out.println("1: check balance");
            System.out.println("2: withdraw");
            System.out.println("3: deposit");
            System.out.println("4: log off");
            System.out.print("Enter a choice: ");
            choice = input.nextInt();
            System.out.println(choice);
            if (choice < 1 || choice > 4) {
                System.out.println("Wrong choice, try again: ");
            }      
            else {
                break;
            }
        }
        return choice;
    }
}

class Account {
    private int id;
    private double balance;

    public Account() {
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return balance;
    }

    public void setId(int newId) {
        id = newId;
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}