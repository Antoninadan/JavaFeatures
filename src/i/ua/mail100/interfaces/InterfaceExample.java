package i.ua.mail100.interfaces;

import i.ua.mail100.reflection.ReflectionExample;

public interface InterfaceExample extends Comparable {
    public static final int FIELD1 = 1;
    public int FIELD2 = 1;
    String string = "kjbbkjb";

    public void methodNoBody1();

    public void methodNoBody2();

    default void methodBody1() {

        System.out.println("methodBody1");
        System.out.println("\n" + ReflectionExample.getModifiers(string));
        System.out.println("\n" + ReflectionExample.getModifiers(FIELD1));
        System.out.println("\n" + ReflectionExample.getModifiers(FIELD2));
     }

    default void methodBody2() {
        System.out.println("methodBody1");
    }

    default void methodBody3() {
        System.out.println("methodBody2");
    }



    public void publicMethod();

    default void defaultMethod(){
        System.out.println("Protected method - parent");
    }

    private void privateMethod(){
        System.out.println("Private method - parent");
    }

//     private final void finalMethod() {}

}
