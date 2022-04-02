package i.ua.mail100.functionalinterface2;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {
        Predicate<Integer> negative = i -> (i < 0);
        System.out.println(negative.test(-6));
        System.out.println(negative.test(6));
        System.out.println(negative.test(0));

        System.out.println();

        Predicate<String> containsA = t -> t.contains("A");
        Predicate<String> containsB = t -> t.contains("B");
        System.out.println(containsA.and(containsB).test("ABCD"));
    }
}
