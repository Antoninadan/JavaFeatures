package i.ua.mail100.init;

public class InitClassRunner {
    static String a = initStaticField();
    static String b = initStaticField();

    InitClassRunner() { // конструктор класса
        System.out.println("Конструктор ");
    }

    static {
        System.out.println("First static initialization block ");
    }

    static {
        System.out.println("Second static initialization block ");
    }

    {
        System.out.println("First initialization block ");
    }

    {
        System.out.println("Second initialization block ");
    }

    void InitClass() {// имя метода совпадает с именем конструктора но возвращает void
        // метод не вызывается при инициализации
        System.out.println(" метод InitClass " + a);
    }

    public void main() { //- это обычный метод с именем main
        // имя метода совпадает с именем точки входа, но не имеет аргументов
        // метод не вызывается при инициализации
        System.out.println(" метод main - не точка входа " + a);
    }

    public static void method() { // статический метод
        // метод не вызывается при инициализации
        System.out.println("статичные метод с именем methodList()");
    }

    static String initStaticField(){
        System.out.println("init stаtic field");
        return "init stаtic field";
    }

    public static void main(String[] args) {
        System.out.println("main.java.i.ua.mail100.Main");
        new InitClassRunner();

        System.out.println();
        C.value();

        System.out.println();
        D d = new D();
    }


    public static class C {
        static String i = value();

        static {
            System.out.println("C First static initialization block ");
        }

        {
            System.out.println("C First initialization block ");
        }

        public C() {
            System.out.println("C конструктлор");
        }

        static String value() {
            System.out.println("C.i initialized");
            return "C.value works";
        }

        public static void main(String[] args) {
            System.out.println("C main");
        }
    }


    public static class D {
        static String i = value();

        static {
            System.out.println("D First static initialization block ");
        }

        {
            System.out.println("D First initialization block ");
        }

        public D() {
            System.out.println("D конструктлор");
        }

        static String value() {
            System.out.println("D.i initialized");
            return "D.value works";
        }

        public static void main(String[] args) {
            System.out.println("D main");
        }
    }
}

