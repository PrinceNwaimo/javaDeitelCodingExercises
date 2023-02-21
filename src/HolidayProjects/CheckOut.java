package HolidayProjects;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckOut {
    Scanner input = new Scanner(System.in);
    int payment;
     List<String>items = new ArrayList<>();
     List<Integer>quantities = new ArrayList<>();
     List<Integer> prices = new ArrayList<>();
     int discount;
     int finalDiscount;
     double finalVAT;
     int billTotal;
     int AmountPaid;
     String cashierName;
     String customersName;


     public void userDetails(){
         System.out.println("Enter the Customer's Name: ");
     }
     public String purchaseHistory(){
         System.out.println("What did the user buy: ");
         String item = input.next();
         items.add(item);
         System.out.println();

         System.out.println("How many pieces: ");
         int quantity = input.nextInt();
         quantities.add(quantity);

         System.out.println("How much per unit? : ");
         int price = input.nextInt();
         prices.add(price);

         System.out.println("Add more items: ");
         String moreItems = input.next();

         switch (moreItems){
             case "Yes": purchaseHistory();
             case "No":cashierDetails();
             break;
             default:cashierDetails();

         }
         return "Thanks for visiting us";
     }
     public boolean cashierDetails(){
         System.out.println("What is your name: ");
         cashierName = input.nextLine();

         System.out.println("How much discount will he get? : ");
         discount = input.nextInt();

         generateReceipt();
         return true;
     }
     public boolean generateReceipt(){
         System.out.println("""
                 SEMICOLON STORES
                 
                 MAIN BRANCH
                 312 HERBERT MACAULAY WAY, SABO YABA,LAGOS.
                 TEL : 03293828343
                 """);
         System.out.println("Date: " + LocalDate.now());

         System.out.println("""
                 CASHIER : CASHIER'S NAME
                 CUSTOMER NAME:  """);
         customersName = input.next();
         System.out.println("========================================================================================");
         System.out.printf("%30s %10s %15s %n", "ITEM","QUANTITY","PRICE","TOTAL (NGN)");
         int subTotal = 0;
         for (int i = 0; i < items.size(); i++) {
             System.out.printf("%30s %10s %10s %15s %n", items.get(i),quantities.get(i),prices.get(i),subTotal += (quantities.get(i)*prices.get(i)));
             System.out.println("======================================================================================");
             System.out.printf("%50s: %5s%n","sub Total",subTotal);
             System.out.printf("%50s: %5s%n","Discount",finalDiscount = (discount/100 *subTotal));
             System.out.printf("%50s: %5s%n", "VAT @ 17.50",finalVAT = (17.50/100 * subTotal));
             System.out.println("======================================================================================");
             System.out.printf("%50s: %5s%n","Bill Total:",billTotal = (int)(subTotal - finalDiscount *finalVAT));
             System.out.println("======================================================================================");
             System.out.printf("%s%s%n", "This is not a Receipt kindly pay ",billTotal);
             System.out.println("======================================================================================");
             System.out.println();
             System.out.println("How much did the User pay? : ");
             payment = input.nextInt();

             printReceipt();
         }
         return true;


         }

    public String printReceipt() {
        System.out.println("SEMICOLON STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: 312,HERBERT MARCULAY WAY,SABO YABA, LAGOS");
        System.out.println("  TEL : 03293828343");
        System.out.println("Date : " +LocalDate.now());
        System.out.println("""
                 CASHIER : CASHIER'S NAME
                 CUSTOMER NAME:  """);
        System.out.println("========================================================================================");
        System.out.printf("%30s %10s %15s %n", "ITEM","QUANTITY","PRICE","TOTAL (NGN)");
        System.out.println("-----------------------------------------------------------------------------------------");

        int subTotal = 0;
        for (int i = 0; i < items.size(); i++) {
            System.out.printf("%30s %10s %10s %15s %n", items.get(i),quantities.get(i),prices.get(i),subTotal += (quantities.get(i)*prices.get(i)));
            System.out.println("======================================================================================");
            System.out.printf("%50s: %5s%n","sub Total",subTotal);
            System.out.printf("%50s: %5s%n","Discount",finalDiscount = (discount/100 *subTotal));
            System.out.printf("%50s: %5s%n", "VAT @ 17.50",finalVAT = (17.50/100 * subTotal));
            System.out.println("======================================================================================");
            System.out.printf("%50s: %5s%n","Bill Total:",billTotal = (int)(subTotal - finalDiscount *finalVAT));
            System.out.printf("%50s: %5s%n","Amount paid: ",payment);
            System.out.printf("%50s: %5s%n", "Balance: ", payment - subTotal);
            System.out.println("======================================================================================");
            System.out.println("THANK YOU FOR YOUR PATRONAGE "+ customersName + "PLEASE PAY US A VISIT AGAIN");
            System.out.println("======================================================================================");
            System.out.println();


        }
return "Thanks";
    }

}

