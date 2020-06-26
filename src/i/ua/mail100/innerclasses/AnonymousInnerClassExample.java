package i.ua.mail100.innerclasses;

public class AnonymousInnerClassExample {
    static Demo demo = new Demo() {
        @Override
        public void show() {
            super.show();
            System.out.println("Метод внутреннего анонимного класса");
        }
    };

    static Hello h = new Hello() {
        public void show() {
            System.out.println("Метод внутреннего анонимного класса");
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

interface Hello {
    void show();
}