package Chapter4;


import java.sql.SQLOutput;
import java.util.Scanner;

    public class SwitchCase {
        public static void main(String[] args) {
            Scanner scanner= new Scanner(System.in);
            System.out.println("Abeg wetin be your age?: ");
            int age = scanner.nextInt();

            switch(age){
                case 20:
                    System.out.println("getat");
                    break;
                case 40:
                    System.out.println("you try small");
                    break;
                default:
                    System.out.println(age);
            }
        }
    }


