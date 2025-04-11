// Parent Class For Bank Account

class BankAccount {
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Encapsulation: Getter and Setter Methods
    public String getAccountHolderName() {
        return accountHolderName;

    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;

    }

    public double getBalance() {
        return balance;
    }

    // Method to Deposit Money
    public void deposit(double amount) {
        if (amount > 0 ) {
            balance += amount;
            System.out.println("Deposited Amount:" + amount);
        } else {
            System.out.println("Invalid Deposit Amount.");
        }
    }     

    // Method to Withdraw Money
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw Amount:" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or Insuffience Balance");
        }
    }

    // Polymorphism: Overridable Method
    public void displayAccountDetails() {
        System.out.println("Account Holder Name:" + accountHolderName);
        System.out.println("Balance" + balance);

    }

}


// Child class: Savings Account
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constractor
    public SavingsAccount(String accountHolderName, double initialBalance, double interestRate){
        super(accountHolderName, initialBalance);

    }
    // Method to Calculate interest
    public void calculateInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);

        System.out.println("Interest Earned:" + interest);
    }
    //Overriding displayAccountDetails Method
    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Interest Rate:" + interestRate + "%");
    }

}

// Child class: Current Account
class CurrentAccount extends BankAccount {
    private double overdraftlimit;

    //Consturctor
    public CurrentAccount(String accountHolderName, double initialBalance, double overdraftlimit) {
        super(accountHolderName, initialBalance);
        this.overdraftlimit = overdraftlimit;
    }
    // Overriding withdraw method to allow overdraft
    @Override
    public void withdraw (double amount) {
        if (amount > 0 && (getBalance() + overdraftlimit) >= amount) {
            double newBalance = getBalance() - amount;
            if (newBalance < 0) {
                overdraftlimit += newBalance; // Reduce overdraft limit
            }

        super.deposit(-amount);
       

        System.out.println("Withdraw Amount: " + amount);

            } else {
                System.out.println("Invalid Withdrawal amount or overdraft limit exceeded.");
            }
        }

        // Overriding DisplayAccountDetailsMethod
        @Override
        public void displayAccountDetails() {
            super.displayAccountDetails();
            System.out.println("Overdraft Limit" + overdraftlimit);
        }

    }

// Main Class to Test the Banking System
public class oop {
    public static void main(String[]Args){

        // Creating a Savings Account
        SavingsAccount savings = new SavingsAccount("Mark", 500, 3);
        savings.displayAccountDetails();
        savings.deposit(500);
        savings.calculateInterest();
        savings.withdraw(500);
        System.out.println();

        // Creating a Current Account 
        CurrentAccount current =  new CurrentAccount("John", 3000, 2000);
        current.displayAccountDetails();
        current.withdraw(1500);
        current.withdraw(500);

        current.displayAccountDetails();
    }
}