

/**
 *
 * @author LENOVO
 */

import java.util.Date;

class Transaction {
    private Date date;
    private char type; // 'W' for withdraw, 'D' for deposit
    private double amount;
    private String description;

    public Transaction(char type, double amount, String description) {
        this.date = new Date();
        this.type = type;
        this.amount = amount;
        this.description = description;
    }

    public Date getDate() { return date; }
    public char getType() { return type; }
    public double getAmount() { return amount; }
    public String getDescription() { return description; }

    @Override
    public String toString() {
        return date + " | " + type + " | " + amount + " | " + description;
    }
}
