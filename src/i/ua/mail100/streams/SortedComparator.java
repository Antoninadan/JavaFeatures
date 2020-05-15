package i.ua.mail100.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

//Функциональный интерфейс предназначенный для сравнения двух объектов
//        одного типа. Чаще всего используется при сортировке. Метод для переопределения -
//        int compare(T o1, T o2) - должен вернуть положительное число, если первый
//        аргумент больше второго, отрицательное, если второй больше первого и 0, если они
//        равны

public class SortedComparator {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11, 4, 7, 5, 8, 9));

        ArrayList<Integer> listOne = list.stream()
                .sorted((a, b) -> a - b)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(listOne);
    }

}
