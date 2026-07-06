package src;

public class Account {
    private int balance;
    public int getBalance()     {
        return balance;
    }
    public void deposit(int amount) {
        if (amount > 0) balance = balance + amount;
    }
    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) balance = balance - amount;
    }

    public int accountPin(int pin) {
          pin = 1234;
        return pin;
    }

    public void registerAccount() {
        String customerName = "";

    }
}
