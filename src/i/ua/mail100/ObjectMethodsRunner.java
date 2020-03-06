package i.ua.mail100;

public class ObjectMethodsRunner {
    public static void main(String[] args) throws CloneNotSupportedException {
        // test finalize
        testFinalize();
        System.gc(); // Call garbage collector

        // test toString
        ObjectMethodsExample objectMethodsExample = new ObjectMethodsExample(1);
        System.out.println("objectMethodsExample = " + objectMethodsExample + "\n");

        // test clone
        ObjectMethodsExample o1 = new ObjectMethodsExample(100);
        ObjectMethodsExample o2 = o1.clone();
        System.out.println("o2 = " + o2 + "\n");

        // test getClass
        Class<?> objectMethodsExampleClass = objectMethodsExample.getClass();
        System.out.println("objectMethodsExample class = " + objectMethodsExampleClass + "\n");

        // test hashCode
        int objectMethodsExamplehashCode = objectMethodsExample.hashCode();
        System.out.println("objectMethodsExample hashCode = " + objectMethodsExamplehashCode + "\n");

        System.out.println("o1.hashCode() = " + o1.hashCode());
        System.out.println("o2.hashCode() = " + o2.hashCode());



    }

    // dont work?
    public static void testFinalize() {
        ObjectMethodsExample objectMethodsExample = new ObjectMethodsExample(1);

    }
}
