package i.ua.mail100.immutable;

public class ImmutableRunner {
    public static void main(String[] args) {
        // true exmpl
        String name = "baeldung";
        String newName = name.replace("dung", "----");
        System.out.println("baeldung".equals(name));       // true
        System.out.println("bael----".equals(newName));    // true



        // not true
        String str1 = "I love Java";
        String str2 = str1;//обе переменные-ссылки указывают на одну строку.
        System.out.println(str2);
        str1 = "I love Python";//но поведение str1 никак не влияет на str2
        System.out.println(str2);//str2 продолжает указывать на строку "I love Java", хотя str1 уже указывает на другой объект

        Integer integerLiteral1 = 1;
        Integer integerLiteral2 = integerLiteral1;
        System.out.println(integerLiteral2);
        integerLiteral1 = 2;
        System.out.println(integerLiteral2);

        Integer integerObject1 = new Integer(1);
        Integer integerObject2 = integerObject1;
        System.out.println(integerObject2);
        integerObject1 = new Integer(2);
        System.out.println(integerObject2);
    }
}
