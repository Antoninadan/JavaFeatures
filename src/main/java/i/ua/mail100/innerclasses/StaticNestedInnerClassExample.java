package i.ua.mail100.innerclasses;

public class StaticNestedInnerClassExample {
    static class NestedInnerClass {
        public void show() {
            System.out.println("Метод внутреннего класса");
        }
    }

    public static void main(String[] args) {
        StaticNestedInnerClassExample.NestedInnerClass inner = new StaticNestedInnerClassExample.NestedInnerClass();
        inner.show();
    }
}
