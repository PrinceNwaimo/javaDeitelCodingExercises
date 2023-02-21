package Chapter5;

public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 10000.0; // initial amount before interest
        double rate = 0.05; // interest rate
        // display headers
        System.out.printf("%s %n", "Year", "Amount on deposit");
        //calculate amount on deposit for 10 years
        for (int year = 1; year <= 10; ++year) {
            // calculate new amount on deposit for specified year
            double amount = principal * Math.pow(1.0 + rate, year);

            // display the year and the amount
            System.out.printf("%4d%,20.2f%n", year, amount);
        }
    }
}