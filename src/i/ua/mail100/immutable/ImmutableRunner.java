package i.ua.mail100.immutable;

public class ImmutableRunner {
    public static void main(String[] args) {
        String name = "baeldung";
        String newName = name.replace("dung", "----");

        System.out.println("baeldung".equals(name));
        System.out.println("bael----".equals(newName));
    }
}
