package Chapter3;


import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Prince Nwaimo",150000.00,"2000");
        Account account2 = new Account("Emmanuel Azu",5000,"2022");
        Account account3 = new Account("Emeka Okoro",1000,"2022");

        Scanner input = new Scanner(System.in);
        System.out.println("Account balance "+account1.getName()+" "+account1.getBalance());
        System.out.println("Account balance "+account2.getName()+" "+account2.getBalance());
        System.out.println("Account balance "+account3.getName()+" "+account3.getBalance());
        System.out.print("Enter an amount for deposit: ");
        double depositAmount = input.nextDouble();
        System.out.println("Adding "+depositAmount+ "to account1 balance");
        account1.deposit(depositAmount);
        System.out.println(account1.getName()+ " New balance: "+ account1.getBalance());
        System.out.println("Adding "+depositAmount+"to account2 balance");
        account2.deposit(depositAmount);
        System.out.println(account2.getName()+ " New balance: "+ account2.getBalance());
        System.out.print("Enter an amount for withdrawal: ");
        double withdrawalAmount = input.nextDouble();
        account2.withdrawal(withdrawalAmount);
        System.out.println(account2.getName()+ " New balance is: " + account2.getBalance());


    }

}
