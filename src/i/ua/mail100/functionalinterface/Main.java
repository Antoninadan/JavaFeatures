package i.ua.mail100.functionalinterface;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FunctionalInterfaceItem functionalInterface;
        A a = new A();

        functionalInterface = A::getStaticMethod;
        System.out.println("STATIC: functionalInterface.get(1) = " + functionalInterface.get(1));

        functionalInterface = a::getMethod;
        System.out.println("NON STATIC functionalInterface.get(1) = " + functionalInterface.get(1));



        // constructor
        FunctionalInterfaceConstructor constructor;
        constructor= A::new;
        constructor.get();



        // функциональный интерфейс Comparator
        Integer[] array = { -2, 1, -1, 4, -3, 5, 6, -8, 9 };
        Arrays.sort(array, (nOne, nTwo) -> Math.abs(nOne) - Math.abs(nTwo));
        System.out.println(Arrays.toString(array));
    }
}

@FunctionalInterface
interface FunctionalInterfaceItem {
    public int get(int n);
}

@FunctionalInterface
interface FunctionalInterfaceConstructor {
    public void get();
}

class A {
    public A(){
        System.out.println("run constructor");
    }

    public static int getStaticMethod(int n) {
        return 3 * n;
    }

    public int getMethod(int n) {
        return 5 * n;
    }
}