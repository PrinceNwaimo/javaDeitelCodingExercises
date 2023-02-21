package Chapter5;

import java.util.Scanner;

public class pythagorasTriple {
    public static void main(String[] args) {

        for ( int hypotenuse = 1; hypotenuse <=500 ; hypotenuse++) {
            for (int side2= 1; side2 <= 500;side2++) {
                for (int side1 = 1; side1 <= 500; side1++) {
                   if ((side1*side1)+(side2*side2)==(hypotenuse*hypotenuse)){
                       System.out.println("Triple is: "+ side1+"   "+side2+"   "+ hypotenuse);
                   }
                    }
                    }


                }
                
            }




        }



