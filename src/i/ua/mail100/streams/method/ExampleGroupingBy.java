package i.ua.mail100.streams.method;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ExampleGroupingBy {
    public static void main(String[] args) {

        List<Worker> workers = Arrays.asList(
                new Worker(" ManagerOne", 32, 2300, "manager"),
                new Worker("Killer", 32, 2300, "killer"),
                new Worker("ManagerTwo", 32, 2300, "manager"),
                new Worker("Teacher", 32, 2300, "teacher"));

//        1. Группировка списка рабочих по их должности (деление на списки)
        Map<String, List<Worker>> map1 = workers
                .stream()
                .collect(Collectors.groupingBy(Worker::getPosition));


//        2. Группировка списка рабочих по их должности (деление на множества)
        Map<String, Set<Worker>> map2 = workers
                .stream()
                .collect(Collectors.groupingBy(Worker::getPosition, Collectors.toSet()));

//        3. Подсчет количества рабочих, занимаемых конкретную должность
        Map<String, Long> map3 = workers
                .stream()
                .collect(Collectors.groupingBy(Worker::getPosition, Collectors.counting()));


//        4. Группировка списка рабочих по их должности, при этом нас интересуют только имена
        Map<String, Set<String>> map4 = workers
                .stream()
                .collect(Collectors.groupingBy(Worker::getPosition,
                        Collectors.mapping(Worker::getName, Collectors.toSet())));


//        5. Расчет средней зарплаты для данной должности
        Map<String, Double> map5 = workers
                .stream()
                .collect(Collectors.groupingBy(Worker::getPosition,
                        Collectors.averagingInt(Worker::getSalary)));


//        6. Группировка списка рабочих по их должности, рабочие представлены только именами единой строкой
        Map<String, String> map6 = workers
                .stream()
                .collect(Collectors.groupingBy(Worker::getPosition,
                        Collectors.mapping(Worker::getName,
                                Collectors.joining(", ", "{", "}")))
                );


//        7. Группировка списка рабочих по их должности и по возрасту.
        Map<String, Map<Integer, List<Worker>>> collect = workers
                .stream()
                .collect(Collectors.groupingBy(Worker::getPosition,
                        Collectors.groupingBy(Worker::getAge)));

    }
}

class Worker {
    private String name;
    private int age;
    private int salary;
    private String position;

    public Worker(String name, int age, int salary, String position) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }
}