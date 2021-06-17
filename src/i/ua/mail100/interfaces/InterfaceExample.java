package i.ua.mail100.interfaces;

import i.ua.mail100.reflection.ReflectionExample;

public interface InterfaceExample extends Comparable {
    public static final int FIELD1 = 1;
    int FIELD2 = 1;  // public static final
    String string = "kjbbkjb";

    public abstract void publicAbstractMethod(); // public abstract

    // public default
    public default void defaultMethod() {
        System.out.println("method1 - public default");
        privateMethod();
        System.out.println("\n" + ReflectionExample.getModifiers(string));
        System.out.println("\n" + ReflectionExample.getModifiers(FIELD1));
        System.out.println("\n" + ReflectionExample.getModifiers(FIELD2));
     }

    private void privateMethod() {
        System.out.println("private method");
    }

//     private final void finalMethod() {
//         System.out.println("final method");
//     }

}
