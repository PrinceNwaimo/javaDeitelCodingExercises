package BankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static java.math.BigDecimal.ZERO;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    private Bank wemaBank;
    @BeforeEach
    public void StartEachTestWith(){
        wemaBank = new Bank();
        wemaBank.createAccountFor("Prince","Nwaimo","1234");
    }
    @Test
    public void accountCanBeCreatedInBankTest(){
        assertEquals(1,wemaBank.getNumberOfCustomers());
    }
    @Test
    public void accountCanBeFoundAfterCreation(){

        String expected = """
                                =======================
                                Account Name: Prince Nwaimo
                                =======================
                                Account Number: 1
                                =======================
                                Account Balance: 0
                                ======================
                                """;
        assertEquals(expected,wemaBank.findAccount(1).toString());

    }

    @Test
    public void balanceCanBeCheckedTest(){
        assertEquals("0",wemaBank.checkBalanceFor(1,"1234").toPlainString());
    }
    @Test
    public void depositIntoAccountTest(){
        wemaBank.depositInto(BigDecimal.valueOf(5000),1);
        assertEquals(BigDecimal.valueOf(5000),wemaBank.checkBalanceFor(1,"1234"));
    }
    @Test
    public void withdrawFromAccountTest(){
        wemaBank.depositInto(BigDecimal.valueOf(50),1);
        wemaBank.withdrawFrom(BigDecimal.valueOf(50),1,"1234");
        assertEquals(BigDecimal.valueOf(0),wemaBank.checkBalanceFor(1,"1234"));
    }
    @Test
    public void transferMoneyToAccountTest(){
        wemaBank.createAccountFor("Allwell","Nwanko","5555");
        wemaBank.depositInto(BigDecimal.valueOf(5000),2);
        wemaBank.transfer(BigDecimal.valueOf(2000),2,1,"5555");
        assertEquals(BigDecimal.valueOf(2000),wemaBank.checkBalanceFor(1,"1234"));
        assertEquals(BigDecimal.valueOf(3000),wemaBank.checkBalanceFor(2,"5555"));

    }
    @Test
    public void closeAccountTest(){
        wemaBank.createAccountFor("Allwell","Nwanko","5555");
        wemaBank.closeAccountFor(2);
        assertEquals(2,2);
    }

}
