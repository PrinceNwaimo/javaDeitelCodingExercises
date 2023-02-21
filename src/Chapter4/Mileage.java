package Chapter4;

import java.util.Scanner;

/*4.17 (Gas Mileage) Drivers are concerned with the mileage their automobiles get. One driver has
kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
a Java application that will input the miles driven and gallons used (both as integers) for each trip.
The program should calculate and display the miles per gallon obtained for each trip and print the
combined miles per gallon obtained for all trips up to this point. All averaging calculations should
produce floating-point results. Use class Scanner and sentinel-controlled iteration to obtain the data
from the user*/
public class Mileage {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        float averageMilesPerGallon = 0;
        int totalTrips = 0;
        int milesDriven = 0;
        int gallons = 0;
        int milesPerGallon = 0;
        int totalMilesPerGallon = 0;
        System.out.print("Enter miles driven or -1 to quit: ");
        milesDriven = input.nextInt();
        System.out.print("Enter gallons used or -1 to quit: ");
        gallons = input.nextInt();
        while (milesDriven != -1){
          milesPerGallon = milesDriven/gallons;
            System.out.println("Miles per gallon  for this trip is: "+milesPerGallon);
            totalMilesPerGallon = totalMilesPerGallon + milesPerGallon;
            totalTrips = totalTrips + 1;
            System.out.println("Enter miles driven or -1 to quit: ");
            milesDriven = input.nextInt();
            System.out.println("Gallons used: ");
            gallons = input.nextInt();
        }
        if (totalTrips != 0){
            System.out.println("Number of trips take: "+totalTrips);
            averageMilesPerGallon =(float) totalMilesPerGallon/totalTrips;
            System.out.println("Total Miles per gallon for all trips is: "+totalMilesPerGallon);
            System.out.println("Average miles per gallon per trip is: "+averageMilesPerGallon);
        }
        else
            System.out.println("No data entered");

    }
}
