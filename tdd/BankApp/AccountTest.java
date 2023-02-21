package BankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {
    private Account princeAccount;
    @BeforeEach
    public void startWithThis(){
         princeAccount = new Account("1234","Prince Nwaimo",3456790);
    }
    @Test
    public void depositMoneyTest(){
        //when I have an account
        Account princeAccount = new Account("1234","prince Nwaimo",3456790);
        princeAccount.deposit(BigDecimal.valueOf(2000));
        assertEquals(BigDecimal.valueOf(2000), princeAccount.getBalance("1234"));
    }
    @Test
    public void getBalanceWithCorrectPinTest(){
        //when I have an account
        Account princeAccount = new Account("1234","Prince Nwaimo",3456790);
        princeAccount.deposit(BigDecimal.valueOf(2000));
        assertEquals(BigDecimal.valueOf(2000), princeAccount.getBalance("1234"));
    }
    @Test
    public void getBalanceWithWrongPinThrowsExceptionTest(){
        //when I have an account
        Account princeAccount = new Account("1234","Prince Nwaimo",3456790);
        princeAccount.deposit(BigDecimal.valueOf(2000));
        assertThrows(IllegalArgumentException.class,()-> princeAccount.getBalance("2231"));
        assertEquals(BigDecimal.valueOf(2000),princeAccount.getBalance("1234"));
    }
    @Test
    public void withdrawalMoneyTest(){
        //when I have an account
        Account princeAccount = new Account("1234","Prince Nwaimo",3456790);
        princeAccount.deposit(BigDecimal.valueOf(2000));
        princeAccount.withdraw(BigDecimal.valueOf(1000),"1234");
        assertEquals(BigDecimal.valueOf(1000),princeAccount.getBalance("1234"));
    }
@Test
    public void getBalanceWithWrongWithdrawalAmountTest(){
        //when I have an account
        Account princeAccount = new Account("1234","Prince Nwaimo",3456790);
        princeAccount.deposit(BigDecimal.valueOf(2000));
        assertThrows(IllegalArgumentException.class,()-> princeAccount.withdraw(BigDecimal.valueOf(5000),"1234"));
    }
    @Test
    public void printAccountTest(){
        System.out.println(princeAccount);
    }



}