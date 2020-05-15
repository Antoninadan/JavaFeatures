package i.ua.mail100.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

//Predicate<T> - функциональный интерфейс появился в JDK 1.8. Переопределяется для того,
//        чтобы указать, подходит объект по критерию или нет. Если подходит, то вернет true, если нет, то
//        false. Метод для реализации - boolean test(T t). filter (Predicate<T> ) промежуточный метод,
//        который оставит в потоке только те элементы, для которых реализация Predicate вернет true.

public class FilterPredicate {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 5, 7, 8, 9));

        ArrayList<Integer> listOne = list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(listOne);
    }
}
