package BankApp;

import java.math.BigDecimal;

public class Account {
    private BigDecimal balance = BigDecimal .ZERO;

    private final String  accountName;
    private final int  accountNumber;
    private String pin;


    public Account(String accountPin,String accountName, int accountNumber) {
        pin = accountPin;
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }

    public void deposit(BigDecimal amount) {
        validate(pin);
        balance = balance.add(amount);


    }
    public BigDecimal getBalance(String pin){
       validate(pin);
        return balance;
    }


    public void withdraw(BigDecimal amount, String pin) {
        validate(pin);
        if((balance.compareTo(amount)) < 0)throw new IllegalArgumentException("Invalid amount");
         balance =balance.subtract(amount);
    }
    @Override
    public String toString(){
        return String.format("""
                =======================
                Account Name: %s
                =======================
                Account Number: %s
                =======================
                Account Balance: 0
                ======================
                """,accountName,accountNumber,balance);
    }
    private void validate(String accountPin){
        if (!accountPin.equals((this.pin))) throw new IllegalArgumentException("Invalid Pin");
    }
}