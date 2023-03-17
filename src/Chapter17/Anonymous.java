package Chapter17;

public class Anonymous {
    public static void main(String[] args) {


        Toyota toyota = new Toyota();

        CarMethod carMethod = new CarMethod() {
            @Override
            public void move() {
                System.out.println("Move");
            }

            @Override
            public void stop() {
                System.out.println("Stop");
            }
        };
        toyota.move(carMethod);
        toyota.stop(carMethod);
    }
}