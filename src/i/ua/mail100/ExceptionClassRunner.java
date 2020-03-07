package i.ua.mail100;

public class ExceptionClassRunner {
    public static void main(String[] args) {
        int a = 3;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        } finally {
            System.out.println("But the program is still running");
        }
        System.out.println("End");


        try {
            System.out.println(sum(3, 4));
            System.out.println(sum(5, 6));
        } catch (ExceptionClassExample | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }


    static int sum(int a, int b) throws ExceptionClassExample {
        if (a == 5) throw new ExceptionClassExample();
        return a + b;
    }
}
