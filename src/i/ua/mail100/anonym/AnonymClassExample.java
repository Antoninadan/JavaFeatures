package i.ua.mail100.anonym;

import i.ua.mail100.AbstractTestClass;
import i.ua.mail100.TestInterface;
import i.ua.mail100.TestInterfaceWithTwoMethods;

public class AnonymClassExample {
    public static void main(String[] args) {
        // anonym class from abstract
        AbstractTestClass abstractTestClass = new AbstractTestClass() {
            @Override
            public void abstractMethod() {
                System.out.println("realization here!");
            }
        };
        abstractTestClass.abstractMethod();
        abstractTestClass.method();



        // anonym class from interface - full version
        TestInterface testInterface2 = new TestInterface() {
            @Override
            public void method() {
                System.out.println("interface realization");
            }
        };

        // anonym class from interface - lambda
        TestInterface testInterface = () -> System.out.println("interface realization");
        testInterface.method();

        // anonym class from interface TWO methods- full version
        TestInterfaceWithTwoMethods testInterfaceWithTwoMethods = new TestInterfaceWithTwoMethods() {
            @Override
            public void method1() {
                System.out.println("interface realization 1");
            }

            @Override
            public void method2() {
                System.out.println("interface realization 2");
            }
        };



    }
}
