package i.ua.mail100.streams.foreach;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForeEachExample {
    public static void main(String[] args) {
//        void forEach(Consumer<? super T> action)

//        @FunctionalInterface
//        public interface Consumer {
//            void accept(T t);
//        }

        List<String> names = Arrays.asList("one", "two", "three", "four");


        // 1. Anonymous Consumer Implementation
        Consumer<String> printConsumer = new Consumer<String>() {
            public void accept(String name) {
                System.out.println(name);
            }
        };
        names.forEach(printConsumer);


        // 2. Lambda Expression
        names.forEach(name -> System.out.println(name));


        // 3. Method Reference
        names.forEach(System.out::println);


    }
}
