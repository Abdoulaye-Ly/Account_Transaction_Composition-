

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;
import java.util.Date;

class Account {
    private int id;
    private String name;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private ArrayList<Transaction> transactions;

    public Account() {
        this.dateCreated = new Date();
        this.transactions = new ArrayList<>();
    }

    public Account(int id, String name, double balance) {
        this();
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getBalance() { return balance; }
    public double getAnnualInterestRate() { return annualInterestRate; }
    public Date getDateCreated() { return dateCreated; }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate() / 100;
    }

    public void withdraw(double amount, String description) {
        if (amount > balance) {
            System.out.println("Insufficient funds!");
            return;
        }
        balance -= amount;
        transactions.add(new Transaction('W', amount, description));
    }

    public void deposit(double amount, String description) {
        balance += amount;
        transactions.add(new Transaction('D', amount, description));
    }

    public void printAccountSummary() {
        System.out.println("Account ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Annual Interest Rate: " + annualInterestRate + "%");
        System.out.println("Balance: $" + balance);
        System.out.println("Transactions:");
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }
}
