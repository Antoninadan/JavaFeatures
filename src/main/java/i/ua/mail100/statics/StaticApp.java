package i.ua.mail100.statics;

import i.ua.mail100.TestClass;

public class StaticApp {
    static int int1;
    static String stringStatic;

    static {
        System.out.println("Static block initialization");
    }

    {
        System.out.println("Non static block initializatino");
    }

    public StaticApp() {
        System.out.println("Constructor");
    }

    static void work(String str){
        str = "1111";
    }

    static void workClass(TestClass testClass){
        testClass.setF(1111);
    }

    public static void main(String[] args) {
        new StaticApp();

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
//        System.out.println("testClass.getA() = " + testClass.getA());

     /*new StaticClassTest();
     new StaticClassTest();*/
    }
}
//
//class Test {
//    public static void main(String[] args) {
//new StaticClassTest();
//    }
//}


/*
    При вызове main() у этого же класса:
        1. Статитческие поля
        2. Статический блок инициализации класса

        При создании екземпляра класса:
        1. Статитческие поля
        2. Статический блок инициализации класса
        3. Нестатический блок инициализации класса
        4. Конструктор
*/
