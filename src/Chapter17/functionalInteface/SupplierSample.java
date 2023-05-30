package Chapter17.functionalInteface;

import java.util.function.Supplier;

public class SupplierSample {
    public static void main(String[] args) {
        System.out.println(supplier.get());
        System.out.println(supplierImperative());
    }
    static Supplier<Integer> supplier =
            ()->20;
    public static int supplierImperative(){
        return 20 * 3;
    }
}
