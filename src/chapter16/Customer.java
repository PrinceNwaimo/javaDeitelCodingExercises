package chapter16;

public class Customer implements Comparable<Customer>{
    private static double getBalance;
    //This class is to show the difference between comparable interface and comparator interface.
    private String name;

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", id=" + id +
                '}';
    }

    private double balance;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Customer(String name, double balance, int id) {
        this.name = name;
        this.balance = balance;
        this.id = id;
    }

    @Override
    public int compareTo(Customer customer) {
        if (this.getBalance()>customer.getBalance)return 1;//return positive number
        else if(this.getBalance()<customer.getBalance)return-1;//return negative number
        return 0;
    }
}
