package Chapter7;

import Chapter3.Account;

import java.util.Arrays;

public class AccountExample1 {
    public static void main(String[] args) {
        Account[] accounts = new Account[5];
        // utility function of Arrays
        int[] numbers ={1000,2000,3000,4000,5000,6000,53630,9500};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        //Another utility function of Array
        System.out.println("4000 is located at index "+Arrays.binarySearch(numbers,4000));
        System.out.println("  ");
        Arrays.stream(numbers).forEach(System.out::println);
        System.out.println("    ");

        // enhanced for loop
        for(int prince:numbers){
            System.out.println(prince);
        }
        Account accountMap = new Account();
        Account accountTrail = new Account();
        Account accountNature = new Account();
        Account accountFelix = new Account();
        Account accountMash = new Account();

        accounts[0]= accountMap;
        accounts[1] = accountTrail;
        accounts[2] = accountTrail;
        accounts[3] = accountFelix;
        accounts[4] =accountMash;
        System.out.println("    ");
        System.out.println(Arrays.toString(accounts));


    }
}
