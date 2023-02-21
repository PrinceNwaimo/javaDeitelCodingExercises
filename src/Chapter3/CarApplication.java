package Chapter3;

public class CarApplication {
    public static void main(String[] args) {
        Car bmw = new Car("A5","2022",30000.00);
        Car toyota = new Car("Camry","2021",50000.00);
        System.out.println(bmw.getPrice());
        System.out.println(toyota.getPrice());
    }
}
