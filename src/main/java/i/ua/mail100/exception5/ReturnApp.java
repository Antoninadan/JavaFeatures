package i.ua.mail100.exception5;

public class ReturnApp {
    public static void main(String[] args) {
        System.out.println(method());
    }

    static int method() {
        try {
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return 100;
        }
    }
}
