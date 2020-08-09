package i.ua.mail100.streams.method;

import java.io.Serializable;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example2 {
    public static void main(String[] args) {
        Address ukraineOne = new Address("Ukraine", "Kyiv", "Kashtanova");
        Address ukraineTwo = new Address("Ukraine", "Kyiv", "Donetska");
        Address usaOne = new Address("USA", "New York", "13 Avenue");
        Address usaTwo = new Address("USA", "LA", "14 Avenue");
        Address canadaOne = new Address("Canada", "Ottawa", "101canadaAvenue");
        Address canadaTwo = new Address("Canada", "Toronto", "100canadaAvenue");
        Address canadaThree = new Address("Canada", "Victoria", "1000canadaAvenue");

        List<Man> list = Arrays.asList(
                new Man("Ivan", "Ivanenko10", 10, 0, ukraineOne),
                new Man("Petro", "Petrenko20", 20, 2, ukraineTwo),
                new Man("Maria", "Matios50", 50, 1, ukraineTwo),
                new Man("Natalya", "Natalko60", 60, 0, usaOne),
                new Man("Matviy", "Matviyko40", 40, 0, usaOne),
                new Man("Yan", "Yanevskiy15", 15, 0, canadaOne),
                new Man("Aaron", "Aaronov21", 21, 3, canadaTwo),
                new Man("David", "Davidenko16", 16, 0, canadaThree));

        List<Man> men = new LinkedList<>(list);

        System.out.println("Вывести информацию о всех людях.");
        List<Man> allMans = getAllMan(men);
        print(allMans);

        System.out.println("Вывести информацию о всех адресах.");
        List<Address> allManAddresses = getAllManAddresses(men);
        print(allManAddresses);

        System.out.println("Вывести firstName, lastName, countOfChildren, когда возраст более или равно 20 и отсортировать по firstName");
        List<String> sortManOver20 = getSortManOver20(men);
        print(sortManOver20);

        System.out.println("Изменить firstName = 'John', lastName = 'Kennedi', countOfChildren = 3, когда country == 'US' (or another country)");
        setUkraineManAsJohn(men);
        print(men);
        men.set(0, new Man("Ivan", "Ivanenko10", 16, 0, ukraineOne));
        men.set(1, new Man("Petro", "Petrenko20", 20, 2, ukraineTwo));
        men.set(2, new Man("Maria", "Matios50", 50, 1, ukraineTwo));
        System.out.println("Return to initial state:");
        print(men);

        System.out.println("Вывести firstName, lastName, nameOfStreet, когда country == 'Canada' AND numberOfHome == 3 OR age >= 25");
        List<String> canadaManOver25Children3 = getCanadaManChildren3OrOver25(men);
        print(canadaManOver25Children3);


        System.out.println("Сгруппировать людей по количеству детей и вывести количество");
        Map<Integer, Long> mapGroupingAmountOfChildrenAndCount =
                getGroupingAmountOfChildrenAndCount(men);
        System.out.println(mapGroupingAmountOfChildrenAndCount);


        System.out.println("Сгруппировать людей по количеству детей и возрасту и вывести количество");
        Map<Integer, Map<Integer, Long>> mapGroupingAmountOfChildrenPlusAgeAndCount =
                getGroupingAmountOfChildrenPlusAgeAndCount(men);
        System.out.println(mapGroupingAmountOfChildrenPlusAgeAndCount);


        System.out.println("Сгруппировать людей по городу и названию улицы и вывести количество");
        Map<String, Map<String, Long>> mapGroupingCityPlusStreetAndCount =
                getGroupingCityPlusStreetAndCount(men);
        System.out.println(mapGroupingCityPlusStreetAndCount);


        System.out.println("Сгруппировать адреса по городу и названию улицы и вывести количество адресов, где количество людей больше 4.");
        Map<String, Map<String, Long>> mapGroupingCityPlusStreetAndCountWhereMenMore4 =
                getGroupingCityPlusStreetAndCountWhereMenMore4(men);
        System.out.println(mapGroupingCityPlusStreetAndCountWhereMenMore4);


        /////////
        Map<String, Map<String, Long>> map = new HashMap<>();

        Map<String, Long> map1 = new HashMap<>();
        map1.put("one", 1L);
        map1.put("two", 2L);
        map1.put("three", 3L);

        Map<String, Long> map2 = new HashMap<>();
        map2.put("2one", 1L);
        map2.put("2two", 2L);
        map2.put("2three", 3L);
        map2.entrySet().stream().filter((v) -> v.getValue() >= 2L).forEach(y -> System.out.println(y));


        map.put("one string", map1);
        map.put("two string", map2);

        System.out.println();
        System.out.println(map);
        System.out.println();
/*
        map.entrySet()
                .stream()
                .map(x -> x.getValue())
                .filter(y ->
                        { for (Map.Entry <String, Long> each:y.entrySet()) {
                            System.out.println(each);
                        each.getValue();
                        }
                        }
                )
//                .filter(y -> y.entrySet())
//                .
//                .filter(y->)
                .forEach(x -> System.out.println("654"));*/

//
//                .entrySet().stream().filter((v) -> v.getValue() >= 2L).forEach(y -> System.out.println(y))
//
//        .filter(v -> v.entrySet().stream().filter((v) -> v.getValue() >= 4));
//
//                .map(x -> x.getValue())
//                .map(x -> x.entrySet())
//
//                .filter(m -> m. = 4);
//
//        Map<String, Long> m = map.entrySet()
//                .stream()
//                .map(x -> x.getValue()).collect(Collectors.collectingAndThen(toM));


    }


    //    public static <T> void print(List<? super Man> list) {
//    public static <T extends Man> void print(List<T> list) {
//    public static <T extends Serializable> void print(List<T> list) {
    public static void print(List<?> list) {
//        list.forEach(e -> System.out.println(e));

        list.forEach(System.out::println);
        System.out.println();
    }

//    public static void print(List<?> list) {


    public static List<Man> getAllMan(List<Man> men) {
        List<Man> list = men.stream()
                .collect(Collectors.toList());
        print(list);
        return list;
    }

    public static List<Address> getAllManAddresses(List<Man> men) {
        return men.stream()
                .map(e -> e.getAddress())
                .collect(Collectors.toList());
    }

    public static List<String> getSortManOver20(List<Man> men) {
        return men.stream()
                .filter(e -> e.getAge() >= 20)
                .sorted((n, m) -> n.getFirstName().compareTo(m.getFirstName()))
                .map(e -> (e.getFirstName() + ", " + e.getLastName() + ", " + e.getCountOfChildren()))
                .collect(Collectors.toList());
    }

    public static void setUkraineManAsJohn(List<Man> men) {
        men.stream()
                .filter(e -> e.getAddress().getCountry().equals("Ukraine"))
                .peek(e -> {
                    e.setFirstName("Jhon");
                    e.setLastName("Kennedi");
                    e.setCountOfChildren(3);
                });
    }

    public static List<String> getCanadaManChildren3OrOver25(List<Man> men) {
        return men.stream()
                .filter(e -> e.getAddress().getCountry() == "Canada" && e.getCountOfChildren() == 3 || e.getAge() >= 25)
                .map(e -> (e.getFirstName() + ", " + e.getLastName() + ", " + e.getAddress().getStreet()))
                .collect(Collectors.toList());
    }

    public static Map<Integer, Long> getGroupingAmountOfChildrenAndCount(List<Man> men) {
        return men.stream()
                .collect(Collectors.groupingBy(Man::getCountOfChildren, Collectors.counting()));
    }

    public static Map<Integer, Map<Integer, Long>> getGroupingAmountOfChildrenPlusAgeAndCount(List<Man> men) {
        return men.stream()
                .collect(Collectors.groupingBy(Man::getCountOfChildren,
                        Collectors.groupingBy(Man::getAge, Collectors.counting())));
    }


    public static Map<String, Map<String, Long>> getGroupingCityPlusStreetAndCount(List<Man> men) {
        return men.stream()
                .map(e -> e.getAddress())
                .collect(Collectors.groupingBy(Address::getCity,
                        Collectors.groupingBy(Address::getStreet, Collectors.counting())));
    }

    public static Map<String, Map<String, Long>> getGroupingCityPlusStreetAndCountWhereMenMore4(List<Man> men) {
        return men.stream()
                .map(e -> e.getAddress())
                .collect(Collectors.groupingBy(Address::getCity,
                        Collectors.groupingBy(Address::getStreet, Collectors.counting())));
//                        Collectors.groupingBy(Address::getStreet, Collectors.counting())))
//                .entrySet()
//                .stream()
//                .filter(m -> m.getValue().entrySet().stream().filter( x-> x.getValue()>=4) == true);
    }

    public static void getGroupingCityPlusStreetAndCountWhereMenMore41(List<Man> men) {

        class ForUse {
            private String city;
            private String street;

            public ForUse(String city, String street) {
                this.city = city;
                this.street = street;
            }

            public String getCity() {
                return city;
            }

            public String getStreet() {
                return street;
            }

            @Override
            public String toString() {
                return "ForUse{" +
                        "city='" + city + '\'' +
                        ", street='" + street + '\'' +
                        '}';
            }
        }

       men.stream()
                .map(e -> e.getAddress())
                .collect(Collectors.groupingBy(a -> new ForUse(a.getCity(), a.getStreet()), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 4)
                .forEach(e -> System.out.println(e.getKey()));

        sendLambdas(s -> System.out.println(s));

    }

    public static void sendLambdas(Consumer<String> stringConsumer) {

    }


}

class Man {
    private String firstName;
    private String lastName;
    private int age;
    private int countOfChildren;
    private Address address;

    public Man(String firstName, String lastName, int age, int countOfChildren, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.countOfChildren = countOfChildren;
        this.address = address;
    }

    @Override
    public String toString() {
        return firstName + ", " + lastName + ", age=" + age +
                ", children=" + countOfChildren +
                ", " + address;
    }

    public Address getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getCountOfChildren() {
        return countOfChildren;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCountOfChildren(int countOfChildren) {
        this.countOfChildren = countOfChildren;
    }
}

class Address {
    private String country;
    private String city;
    private String street;

    public Address(String country, String city, String street) {
        this.country = country;
        this.city = city;
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    @Override
    public String toString() {
        return country + " : " + city + " : " + street;
    }
}
