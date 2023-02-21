package Chapter3;

import java.util.Scanner;

public class PetrolPurchaseMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PetrolPurchase ababa = new PetrolPurchase("ABIA","Sulphur",10, 200,0.05);
        System.out.println("Welcome to ABABA petrol station");
        System.out.println("Location "+ababa.getStationLocation());
        System.out.println("Petrol Type "+ababa.getPetrolType());
        System.out.println("Price "+ababa.getPricePerLitre());
        System.out.print("Enter new price: ");
        double price = input.nextDouble();
        ababa.setPricePerLitre(price);
        System.out.print("Enter quantity in litres: ");
        int litres = input.nextInt();
        ababa.setQuantityInLitres(litres);
        System.out.println("Amount to be paid is: "+ababa.getPurchaseAmount());



    }
}
