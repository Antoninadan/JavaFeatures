package i.ua.mail100.functionalinterface2;

import java.util.function.Consumer;

public class ConsumerApp {


    public static void main(String[] args) {
        Consumer<String> consumer1 = str -> System.out.print(str.toUpperCase());
        consumer1.accept("first");

        System.out.println();

        Consumer<String> consumer2 = str -> System.out.print(str+"!");
        consumer1.andThen(consumer2).accept("second");
    }

}
