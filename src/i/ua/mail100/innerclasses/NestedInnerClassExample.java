package i.ua.mail100.innerclasses;

public class NestedInnerClassExample {
    class NestedInnerClass {
        public void show() {
            System.out.println("Метод внутреннего класса");
        }
    }

    public static void main(String[] args) {
        NestedInnerClassExample.NestedInnerClass inner = new NestedInnerClassExample().new NestedInnerClass();
        inner.show();


    }
}
