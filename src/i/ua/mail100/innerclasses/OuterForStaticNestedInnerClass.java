package i.ua.mail100.innerclasses;

public class OuterForStaticNestedInnerClass {
    static class NestedInnerClass {
        public void show() {
            System.out.println("Метод внутреннего класса");
        }
    }

    public static void main(String[] args) {
        OuterForStaticNestedInnerClass.NestedInnerClass inner = new OuterForStaticNestedInnerClass.NestedInnerClass();
        inner.show();
    }
}
