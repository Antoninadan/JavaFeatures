package i.ua.mail100.functionalinterface2;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionApp {
    public static void main(String[] args) {
        Function<String, String> f1 = s -> s + "1";
        Function<String, String> f2 = s -> s + "2";
        Function<String, String> f3 = s -> s + "3";
        Function<String, String> f4 = s -> s + "4";
        System.out.println(f1.andThen(f2).apply("a"));
        System.out.println(f1.andThen(f2).compose(f3).compose(f4).apply("ComposeCompose"));
        System.out.println(f1.andThen(f2).andThen(f3).apply("AndThen"));

        System.out.println();


        Map<String, String> mapa = Arrays.asList("a", "b", "c")
                .stream()
                .map(Function.identity())              // <- Этот кусок
                .map(str -> str)                       // <- равен этому.
                .collect(Collectors.toMap(str -> str,  // <-- А этот
                        Function.identity()            // <-- равен этому.
                ));

        System.out.println("identity: " + mapa);
    }

}
