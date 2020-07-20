package i.ua.mail100.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) throws IOException {
        Stream<Integer> stream;
        Stream<String> streamStr;
        IntStream intStream;

        // 1. Collection.stream()
        List<Integer> list = new ArrayList<>();
        stream = list.stream();

        // 2. Collection.parallelStream()
        stream = list.parallelStream();

        // 3. Stream.of(val1,val2,val3)
        stream =  Stream.of(2, 1, 3);

        // 4. Arrays.stream( array )
        Integer[] array = {1,2,3,4,54,100};
        stream = Arrays.stream(array);

        // 5. Files.lines(путь_к_файлу)
        streamStr = Files.lines(Paths.get("file.txt"));
        streamStr.forEach(System.out::println);

        // 6. «строка».chars()
        String s = "789789kjhkjhkj90890";
        intStream = s.chars();
        intStream.peek(e -> System.out.println(e));

        // 7. Stream.builder()
        Stream.builder().add("a1").add("a2").add("a3").build();

        // 8. Stream.iterate(начальное_условие, выражение_генерации)
        Stream<Integer> streamFromIterate = Stream.iterate(1, n -> n + 1);

//        streamFromIterate.forEach(e -> System.out.println(e));

        // 9. Stream.generate(выражение_генерации)
        Stream<String> streamFromGenerate = Stream.generate(() -> "a1");

//        streamFromGenerate.forEach(e -> System.out.println(e));


    }
}
