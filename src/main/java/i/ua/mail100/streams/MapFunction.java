package i.ua.mail100.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;


//Интерфейс Function<T,R> - появился в JDK 1.8 . Предназначен для создания
//        объекта (произвольного в примере R — типа) на основе объекта другого типа (в
//        примере T - типа). Метод для переопределения R apply(T t)

public class MapFunction {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 5, 7, 8, 9));

        ArrayList<String> listOne = list.stream()
                .map(n -> "Number " + n)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(listOne);
    }

}
