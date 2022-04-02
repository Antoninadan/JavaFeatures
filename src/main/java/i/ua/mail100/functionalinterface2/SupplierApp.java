package i.ua.mail100.functionalinterface2;

import java.util.function.Supplier;

public class SupplierApp {

    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> new Integer((int) (Math.random() * 1000D));
        Integer result = supplier.get();
        System.out.println("result = " + result);
    }
}

