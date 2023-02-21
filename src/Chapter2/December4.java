package Chapter2;

import java.util.Scanner;

public class December4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kilogram = 1;
        float pounds =1;

        for ( kilogram = 1; kilogram<= 200 ; kilogram++) {
            for ( pounds = 1; pounds <= 500 ; pounds++) {
                if (kilogram * 2.2 ==pounds)
                    System.out.println(kilogram+"Kilogram"+  "="  +pounds +"Pounds");


                }




            }


        }

    }

