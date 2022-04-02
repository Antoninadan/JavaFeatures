package i.ua.mail100.clonables;

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

        // this is standart clonable effect. If you want really clone - you need realize this specially
        clonableExampleClass1.setS("Changed!");
        clonableExampleClass1.setA(2);
        System.out.println("c1 = " + clonableExampleClass1);
        System.out.println("c2 = " + clonableExampleClass2);




        NotClonableExampleClass notClonableExampleClass1 = new NotClonableExampleClass(1, "f");
        NotClonableExampleClass notClonableExampleClass2 = null;
        try {
            notClonableExampleClass2 = notClonableExampleClass1.clone();
            System.out.println("c1 = " + notClonableExampleClass1);
            System.out.println("c2 = " + notClonableExampleClass2);
            System.out.println("(c1 == c2) = " + (notClonableExampleClass1 == notClonableExampleClass2));
        } catch (
                CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
