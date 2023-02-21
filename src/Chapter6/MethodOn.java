package Chapter6;

public class MethodOn {
    public static void main(String... prince) {
       //...means that the method can take in zero or more parameters.
        printNumberAsInteger(5);
        printNumberAsInteger(7.2);
        printNumberAsInteger("50");

    }
    private static void printNumberAsInteger(int number){
        System.out.println(number);
    }
    private static void printNumberAsInteger(double number){
         String[]s = String.valueOf(number).split("\\.");
        System.out.println(Integer.parseInt(s[0]));
    }
    private static void printNumberAsInteger(String number){
        System.out.println(Integer.parseInt(number));
    }
}
