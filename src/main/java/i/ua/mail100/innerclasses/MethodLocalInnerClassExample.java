package i.ua.mail100.innerclasses;

public class MethodLocalInnerClassExample {
    void outerMethod() {
        // ONLY FINAL
        final int onlyFinal = 98;
        System.out.println("Метод внешнего класса");
        // Внутренний класс является локальным для метода outerMethod()
        class Inner {
            public void innerMethod() {
                System.out.println("Метод внутреннего класса " + onlyFinal);
            }
        }
        Inner inner = new Inner();
        inner.innerMethod();

        { class Inner2 {
            public void innerMethod() {
                System.out.println("Метод внутреннего класса 2 " + onlyFinal);
            }
        }}

        // Inner2
    }

    public static void main(String[] args) {
        MethodLocalInnerClassExample outer = new MethodLocalInnerClassExample();
        outer.outerMethod();
    }
}
