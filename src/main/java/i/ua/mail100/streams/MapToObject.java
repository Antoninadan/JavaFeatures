package i.ua.mail100.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToObject {

    public static void main(String[] args) {
        example1();
        example2();
    }

    public static void example1(){
        int[] array = {2, 6, 3, 8, 1, 2, 3, 4, 5, -1, -2, 4};

        ArrayList<Integer> res = Arrays.stream(array)
                .mapToObj(n -> n)
                .sorted((nOne, nTwo) -> Math.abs(nOne) - Math.abs(nTwo))
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(res);
    }

    public static void example2() {
        Map<Character, Long> map = null;
        try {
            map = Files.lines(Paths.get("a.txt"))
                    .map(n -> n.toUpperCase())
                    .flatMapToInt(n -> n.chars())
                    .filter(n -> n>='A' && n<='Z')
                    .mapToObj((n) -> (Character.valueOf((char) n)))
                    .collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        } catch (IOException e) {
            System.out.println(e);
        }

        for (Character key : map.keySet()) {
            System.out.println(key + " - " + map.get(key));
        }
    }
}
