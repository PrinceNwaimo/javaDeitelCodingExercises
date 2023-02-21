package Chapter3;

public class Account {
    public int deposit;
    private String name;
    public double balance;
    private String year;


    //The below is a constructor.
    public Account(String name, double balance, String year) {
        this.name = name;//This makes reference to the instance variables instead of initiatizing.
        //you can still do
        //public account(String abaName)
        //abaName = name;
        this.balance = balance;
        this.year = year;
    }

    public Account() {
    }

    public String toString() {
        //we want to override the toString method that doesn't enable us to print correctly.
        return "{" + "balance: " + balance + "}";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getBalance() {
        return balance;
    }


    public void deposit(double depositAmount) {
        if (depositAmount > 0.0)
            balance = balance + depositAmount;
    }

    public String getName() {
        return name;
    }

    public String withdrawal(double withdrawalAmount) {
        if (withdrawalAmount >= balance) {
            balance = balance - withdrawalAmount;
            if (withdrawalAmount < balance) {
            balance = balance;
        }
            return "Thief";

        }
        return "Olee- see your head";

    }

}





