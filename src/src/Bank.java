package src;

public abstract class Bank {
  private String pin;
  private String accountNumber;

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Bank(String pin, String accountNumber) {
        this.pin = pin;
        this.accountNumber = accountNumber;
    }
}
