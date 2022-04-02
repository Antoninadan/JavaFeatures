package i.ua.mail100.functionalinterface2;

import java.util.function.UnaryOperator;

public class UnarryOperatorApp {
    public static void main(String[] args) {

        UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(5));
    }
}