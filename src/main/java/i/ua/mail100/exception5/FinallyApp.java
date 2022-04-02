package i.ua.mail100.exception5;

public class FinallyApp {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("try");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            throw new RuntimeException("finally");
        }
    }
}
