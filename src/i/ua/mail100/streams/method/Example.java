package i.ua.mail100.streams.method;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
    class People {
        String name;
        int age;
        Sex sex;

        public People(String name, int age, Sex sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public int getAge() {
            return age;
        }
    }

    enum Sex {
        MAN,
        WOMEN
    }

    public static void main(String[] args) {
        List<People> people = Arrays.asList(new Example().new People("Вася", 16, Sex.MAN),
                new Example().new People("Петя", 23, Sex.MAN),
                new Example().new People("Елена", 42, Sex.WOMEN),
                new Example().new People("Иван Иванович", 69, Sex.MAN));

        // Выбрать мужчин-военнообязанных (от 18 до 27 лет)
        List<People> warriors = people.stream().filter(i -> i.sex == Sex.MAN && i.age > 18).collect(Collectors.toList());

        // Найти средний возраст среди мужчин
        double averageAge = people.stream().filter(i -> i.sex == Sex.MAN).mapToInt(People::getAge).average().getAsDouble();
    }

}
