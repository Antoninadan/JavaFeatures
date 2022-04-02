package statics2;

public class Statics2App {
    static Integer statInt;
    Integer nonStatInt;


    public static void main(String[] args) {
        System.out.println(statInt);
        // compilation error
        // System.out.println(nonStatInt);

        statMethod();
        statInt = 1;
        StatInnerClass statInnerClass = new StatInnerClass();
        statInnerClass.st();
        statInnerClass.getI();

        // compilation error
        // nonStatInt = 1;
        // nonStatMMethod();


    }

    static void statMethod() {
    }

    void nonStatMMethod() {
    }

    static class StatInnerClass {
        static int i;

        public StatInnerClass() {
            System.out.println("static inner class constuctor");
        }

        static void st() {
            System.out.println("stat method ");
        }

        public static int getI() {
            return i;
        }
    }

    class NonStatInnerClass {
        // compilation error
        // static int i;

        public NonStatInnerClass() {
            System.out.println("static inner class constuctor");
        }

        // compilation error
        // static void st() {
        //     System.out.println("stat method ");
        // }

    }

}
