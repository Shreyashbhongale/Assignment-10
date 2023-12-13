import java.util.Scanner;
class Que4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("put depositor name: ");
        String name = sc.nextLine();
        System.out.print("put account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("put account type: ");
        sc.nextLine(); 
        String accountType = sc.nextLine();
        System.out.print("put initial balance: ");
        double initialBalance = sc.nextDouble();

        BankAccount account = new BankAccount(name, accountNumber, accountType, initialBalance);
        account.deposit(1000);
        account.withdraw(500);

        account.displayDetails();
    }
}
 class  BankAccount {
    private String depositorName;
    private int accountNumber;
    private String accountType;
    private double balance;

    public BankAccount(String depositorName, int accountNumber, String accountType, double initialBalance) {
        this.depositorName = depositorName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = initialBalance;
    }

     public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit amount = " + balance);
        } else {
            System.out.println("Invalid ");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("After withdrwal amount = " + balance);
        } else {
            System.out.println("Invalid ");
        }
    }
    public void displayDetails() {
        System.out.println("Account Details:");
        System.out.println("Depositor Name: " + depositorName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
}