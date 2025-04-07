
/**
 *
 * @author LENOVO
 */
public class AccountTester {
    public static void main(String[] args) {
        Account account = new Account(43219, "Sue", 2050);
        account.setAnnualInterestRate(2.35);

        account.deposit(350, "Salary deposit");
        account.deposit(200, "Gift");
        account.deposit(120, "Bonus");

        account.withdraw(20, "Coffee");
        account.withdraw(230, "Shopping");
        account.withdraw(150, "Bill payment");

        account.printAccountSummary();
    }
}