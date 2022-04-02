package i.ua.mail100.inheritance;

public class SubEmptyOnlyApp extends ParentEmptyOnly {
    public static void main(String[] args) {
        new SubEmptyOnlyApp();
    }
}

class ParentEmptyOnly {
    public ParentEmptyOnly() {
        System.out.println("parent");
    }
}