package i.ua.mail100.innerclasses;

public class AnonymousInnerClassExample {

    static Demo demo = new Demo() {
        @Override
        public void show() {
            super.show();
            System.out.println("override demo");
        }
    };

    static InterfaceDemo h = new InterfaceDemo() {
        public void show() {
            System.out.println("Метод h");
        }
    };

    static InterfaceDemo h2 = () -> {
            System.out.println("Метод h2");
    };

    static AbstractClass abstractClass = new AbstractClass() {
        @Override
        public void show() {

        }
    };

    public static void main(String[] args) {
        demo.show();
        h.show();
    }
}

class Demo {
    public void show() {
        System.out.println("Метод суперкласса");
    }
}

interface InterfaceDemo {
    void show();
}

abstract class AbstractClass{
    abstract public void show();
}