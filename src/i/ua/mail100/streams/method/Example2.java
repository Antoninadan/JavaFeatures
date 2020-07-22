package i.ua.mail100.streams.method;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
                new Man("Ivan", "Ivanenko10", 16, 0, ukraineOne),
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

        System.out.println("Вывести информацию о всех адресах");
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

    }

    public static <T> void print(List<T> list) {
        list.forEach(e -> System.out.println(e));
        System.out.println();
    }

    public static List<Man> getAllMan(List<Man> men) {
        return men.stream()
                .collect(Collectors.toList());
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
                .filter(e -> e.getAddress().getCountry() == "Ukraine")
                .forEach(e -> {
                    e.setFirstName("Jhon");
                    e.setLastName("Kennedi");
                    e.setCountOfChildren(3);
                });
    }

    public static List<String> getCanadaManChildren3OrOver25(List<Man> men) {
        return men.stream()
                .filter(e -> e.getAddress().getCountry() == "Canada" && e.getCountOfChildren() == 3 || e.getAge() >=25)
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
