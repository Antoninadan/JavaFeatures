package i.ua.mail100.statics;

import i.ua.mail100.TestClass;

public class StaticClassTest {
    static int int1;
    static String stringStatic;

    static void work(String str){
        str = "1111";
    }

    static void workClass(TestClass testClass){
        testClass.setA(1111);
    }

    public static void main(String[] args) {
        // immutable
        String stringNonStatic = "000";
        work(stringNonStatic);
        System.out.println(stringNonStatic);

        // immutable
        stringStatic = "000";
        work(stringStatic);
        System.out.println(stringStatic);

        // mutable
        TestClass testClass = new TestClass(0);
        workClass(testClass);
        System.out.println("testClass.getA() = " + testClass.getA());
    }
}
