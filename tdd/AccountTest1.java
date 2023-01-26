import Chapter3.Account;
import Chapter3.AccountTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest1 {
    @Test
    public void depositTest(){
        //Given that I have an account
        Account princeAccount = new Account("Prince Nwaimo", 150_000,"2002");
        Account account = new Account("John Read",5000,"2022");
        Account account1 = new Account("Emeka Okoro",1000,"2022");
        //when I deposit 50_000 into each
        princeAccount.deposit =(50_000);
        //check that account is 200000
        account1.deposit = (5000);
        double princeAccountBalance = princeAccount.getBalance();
        double account1Balance = account1.getBalance();
        assertEquals(200_000,princeAccountBalance);
        assertEquals(6000,account1Balance);




    }
    @Test
    public void withdrawalTest(){
        Account princeAccount = new Account("Prince Nwaimo",200_000,"2002");
        princeAccount.withdrawal(100_000);
        double princeAccountBalance = princeAccount .getBalance();
        assertEquals(100_000,princeAccountBalance);


    }
    @Test
    public void transferTest(){
        Account princeAccount = new Account("Prince Nwaimo",100_000,"2002");
        Account account1 = new Account("Emeka Okoro",6000,"2022");
        princeAccount.transfer(5000);
        double princeAccountBalance = princeAccount.getBalance();
        assertEquals(95000,princeAccountBalance);
        account1.deposit = (5000);
        double account1Balance = account1.getBalance();
        assertEquals(11000,account1Balance);

    }
}
