package i.ua.mail100.innerclasses;

public class OuterForMethodLocalInnerClass {
    void outerMethod() {
        // ONLY FINAL
        final int x = 98;
        System.out.println("Метод внешнего класса");
        // Внутренний класс является локальным для метода outerMethod()
        class Inner {
            public void innerMethod() {
                System.out.println("Метод внутреннего класса " + x);
            }
        }
        Inner inner = new Inner();
        inner.innerMethod();
    }

    public static void main(String[] args) {
        OuterForMethodLocalInnerClass outer = new OuterForMethodLocalInnerClass();
        outer.outerMethod();
    }
}
