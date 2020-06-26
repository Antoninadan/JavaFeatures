package i.ua.mail100.init;

public class InitClassRunner {
    static int a = 100;

    InitClassRunner() { // конструктор класса
        System.out.print(" Конструктор " + a);
    }

    { // блок инициализации
        System.out.print(" 3 " + a);
    }

    void InitClass() {// имя метода совпадает с именем конструктора но возвращает void
        // метод не вызывается при инициализации
        System.out.print(" метод InitClass " + a);
    }

    public static void main(String[] args) {
        System.out.print(" 2 " + a);
        new InitClassRunner();
    }

    public void main() { //- это обычный метод с именем main
        // имя метода совпадает с именем точки входа, но не имеет аргументов
        // метод не вызывается при инициализации
        System.out.print(" метод main - не точка входа " + a);
    }

    public static void method() { // статический метод
        // метод не вызывается при инициализации
        System.out.print("статичные метод с именем  methodList() + a");
    }

    static { // статический блок инициализации
        System.out.print(" 1 " + a);
    }

    public static class C {
        static int i = value();

        static int value() {
            System.out.println("C.i initialized");
            return 1;
        }
    }
}

