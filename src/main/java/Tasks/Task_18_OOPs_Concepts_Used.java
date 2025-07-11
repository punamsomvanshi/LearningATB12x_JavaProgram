package Tasks;

public class Task_18_OOPs_Concepts_Used {

}
// Base Class - Parent
class BankAccount {
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Encapsulation with Getters and Setters
    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Method to be overridden
    public void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

// Derived Class - Child
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor using super and this
    public SavingsAccount(String accountHolder, double balance, double interestRate) {
        super(accountHolder, balance); // calling parent constructor
        this.interestRate = interestRate; // using this keyword
    }

    // Method Overriding (Runtime Polymorphism)
    @Override
    public void displayDetails() {
        super.displayDetails(); // calling parent method
        System.out.println("Interest Rate: " + this.interestRate + "%");
    }

    // Method Overloading (Compile-time Polymorphism)
    public void deposit(double amount, String note) {
        super.deposit(amount);
        System.out.println("Note: " + note);
    }
}

// Main Class to Execute
 class BankingLab {
    public static void main(String[] args) {
        // Creating objects (class & object)
        SavingsAccount sa = new SavingsAccount("Punam", 5000.0, 3.5);

        // Accessing encapsulated fields
        System.out.println("Welcome, " + sa.getAccountHolder());

        // Method overloading
        sa.deposit(1000); // base class method
        sa.deposit(2000, "Monthly Savings"); // overloaded method

        // Method overriding
        sa.displayDetails();

        // Withdraw operation
        sa.withdraw(3000);
    }
}



