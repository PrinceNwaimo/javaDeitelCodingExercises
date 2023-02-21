package BankApp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    ArrayList<Account>accounts = new ArrayList<>();
    public void createAccountFor(String firstName, String lastName,String pin) {
        int accountNumber = accounts.size()+1;
        Account newAccount = new Account(pin,firstName+" "+lastName,accountNumber);
        accounts.add(newAccount);
    }

    public int getNumberOfCustomers() {
        return accounts.size();
    }

    public Account findAccount(int accountNumber) {
        return accounts.get(accountNumber-1);
    }

    public BigDecimal checkBalanceFor(int accountNumber, String pin) {
        Account account = findAccount( accountNumber);
        return account.getBalance(pin);


    }

    public void depositInto(BigDecimal amount, int accountNumber) {
        Account account = findAccount(accountNumber);
        account.deposit(amount);

    }
    public void withdrawFrom(BigDecimal amount,int accountNumber,String pin){
        Account account = findAccount(accountNumber);
        account.withdraw(amount, pin);

    }
    public void transfer(BigDecimal amount, int senderAccountNumber,int receiverAccountNUmber,String senderPin){
        Account senderAccount = findAccount(senderAccountNumber);
        Account receiverAccount = findAccount(receiverAccountNUmber);
        senderAccount.withdraw(amount,senderPin);
        receiverAccount.deposit(amount);

    }

    public void closeAccountFor(int accountNumber) {
        Account account = findAccount(accountNumber);
        accounts.remove(account);
    }
}
