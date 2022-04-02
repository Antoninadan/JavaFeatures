package i.ua.mail100.streams.method;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethod {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("a1", "a2", "a3", "a1");

        // Вернуть количество вхождений объекта «a1»
        // filter(..)
        // count()
        long count = stringList.stream().filter("a1"::equals).count();


        // Вернуть первый элемент коллекции или 0, если коллекция пуста
        // findFirst()
        // orElse(..)
        String first = stringList.stream().findFirst().orElse("0");
        Optional<String> first2 = stringList.stream().findFirst();


        // Вернуть последний элемент коллекции или «empty», если коллекция пуста
        // skip(size)
        // findAny()
        int size = stringList.size();
        String last = stringList.stream().skip(size - 1).findAny().orElse("empty");


        // Найти элемент в коллекции равный «a3» или кинуть ошибку
        String a3 =stringList.stream().filter("a3"::equals).findFirst().get();


        // Вернуть третий элемент коллекции по порядку
        String third = stringList.stream().skip(2).findFirst().get();


        // Вернуть два элемента начиная со второго
        // TODO
        Object[] twoElements = stringList.stream().skip(1).limit(2).toArray();

        Stream stream = Arrays.stream(stringList.stream().skip(1).limit(2).toArray());
        Arrays.stream(stringList.stream().skip(1).limit(2).toArray()).forEach(e ->
                System.out.println(e));

        // Выбрать все элементы по шаблону
        List<String> strings2 = stringList.stream().filter((s) -> s.contains("1")).collect(Collectors.toList());

    }
}
