package i.ua.mail100;

public class ClonebleExampleRunner {
    public static void main(String[] args) {
        ClonableExampleClass clonableExampleClass1 = new ClonableExampleClass(1, "Mumu");
        ClonableExampleClass clonableExampleClass2 = null;

        try {
            clonableExampleClass2 = clonableExampleClass1.clone();
            System.out.println("c1 = " + clonableExampleClass1);
            System.out.println("c2 = " + clonableExampleClass2);
            System.out.println("(c1 == c2) = " + (clonableExampleClass1 == clonableExampleClass2));
        } catch (
                CloneNotSupportedException e) {
            e.printStackTrace();
        }

        clonableExampleClass1.setS("Bebebe");
        System.out.println("c1 = " + clonableExampleClass1);
        System.out.println("c2 = " + clonableExampleClass2);
    }
}
