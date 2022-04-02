package i.ua.mail100.functionalinterface2;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.ToIntFunction;

public class BinaryOperatorApp {
    public static void main(String[] args) {
        BinaryOperator<Integer> multiply = (x, y) -> x * y;

        System.out.println(multiply.apply(3, 5)); // 15
        System.out.println(multiply.apply(10, -2)); // -20



        BinaryOperator<String> maxLengthString = BinaryOperator.maxBy(
                Comparator.comparingInt(String::length));
        String s = maxLengthString.apply("two", "three");
        System.out.println(s);


        // теж саме
        ToIntFunction<String> toIntFunction = x -> x.length();
        BinaryOperator<String> maxLengthString2 = BinaryOperator.maxBy(
                Comparator.comparingInt(toIntFunction));
        String s2 = maxLengthString.apply("two", "three");
        System.out.println(s);


    }
}