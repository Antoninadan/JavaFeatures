package i.ua.mail100.overload;

public class OverloadRunner {
    public static void main(String[] args) {
        method1(1, "Str");
        method1("Str", 1);
    }

    static void method1(int digit, String string){
        System.out.println(digit + string);
    }

    static void method1(String string, int digit){
        System.out.println(string + digit);
    }
}
