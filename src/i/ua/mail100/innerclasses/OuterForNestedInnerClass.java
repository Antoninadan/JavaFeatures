package i.ua.mail100.innerclasses;

public class OuterForNestedInnerClass {
    class NestedInnerClass {
        public void show() {
            System.out.println("Метод внутреннего класса");
        }
    }

    public static void main(String[] args) {
        OuterForNestedInnerClass.NestedInnerClass inner = new OuterForNestedInnerClass().new NestedInnerClass();
        inner.show();


    }
}
