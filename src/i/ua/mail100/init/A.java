package i.ua.mail100.init;

public class A {
    static int a = 1111;
    static
    {
        a = a-- - --a;
        System.out.println("a-- - --a");
    }

    {
        a = a++ + ++a;
        System.out.println("a++ + ++a");
    }

    public static void main(String[] args)  {
        System.out.println(a);

        int b = 1111;
        b = b-- - --b; // = 1111 - (1110 - 1)
//        b = b++ + ++b;
        System.out.println(b);


    }
}