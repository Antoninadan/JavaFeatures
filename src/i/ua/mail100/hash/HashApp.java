package i.ua.mail100.hash;

import java.util.HashMap;
import java.util.Map;

public class HashApp {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = a1;
        System.out.println("a1.hashCode() == a2.hashCode() " + (a1.hashCode() == a2.hashCode()));
        System.out.println("a1.equals(a2) " + a1.equals(a2) + "\n");

        B b1 = new B();
        B b2 = b1;
        System.out.println("b1.hashCode() == b2.hashCode() " + (b1.hashCode() == b2.hashCode()));
        System.out.println("b1.equals(b2) " + b1.equals(b2));

        Map<B, Integer> map = new HashMap<>();
        B b3 = new B(3);
        B b4 = new B(4);
        B b5 = new B(5);
        B b6 = b3;

        map.put(b3, 3);
        map.put(b4, 4);
        map.put(b5, 5);
//        map.put(b6, 6);
        System.out.println(map.get(b3));
        System.out.println(map.get(b4));
        System.out.println(map.get(b5));
        System.out.println(map.get(b6));


        Map<A, Integer> mapA = new HashMap<>();
        A a3 = new A(3);
        A a4 = new A(4);
        A a5 = new A(5);
        A a6 = a3;

        mapA.put(a3, 3);
        mapA.put(a4, 4);
        mapA.put(a5, 5);
//        mapA.put(a6, 6);
        System.out.println(mapA.get(a3));
        System.out.println(mapA.get(a4));
        System.out.println(mapA.get(a5));
        System.out.println(mapA.get(a6));

    }
}

class A{
    public int a;

    public A() {
    }

    public A(int a) {
        this.a = a;
    }
}

class B{
    int b;

    public B() {
    }

    public B(int b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object obj) {
        return this.b==((B)obj).b +1 ;
    }
}
