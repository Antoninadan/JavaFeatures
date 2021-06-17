package i.ua.mail100.statics;

import i.ua.mail100.TestClass;

public class StaticClassTest {
    static int int1;
    static String stringStatic;


    static {
        System.out.println("Static block initialization");
    }

    {
        System.out.println("Non static block initializatino");
    }

    public StaticClassTest() {
        System.out.println("Constructor");
    }

    static void work(String str){
        str = "1111";
    }

    static void workClass(TestClass testClass){
        testClass.setF(1111);
    }

    public static void main(String[] args) {
        // immutable
     /*   String stringNonStatic = "000";
        work(stringNonStatic);
        System.out.println(stringNonStatic);

        // immutable
        stringStatic = "000";
        work(stringStatic);
        System.out.println(stringStatic);

        // mutable
        TestClass testClass = new TestClass(0);
        workClass(testClass);
        System.out.println("testClass.getA() = " + testClass.getA());*/

     /*new StaticClassTest();
     new StaticClassTest();*/
    }
}

class Test {
    public static void main(String[] args) {

    }
}
