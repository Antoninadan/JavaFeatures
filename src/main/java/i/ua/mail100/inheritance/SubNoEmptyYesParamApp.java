package i.ua.mail100.inheritance;

public class SubNoEmptyYesParamApp extends ParentNoEmptyYesParam {
    private String childName;

    public SubNoEmptyYesParamApp(int i) {
        super(i);
        System.out.println("sub class constructor");
    }

// attention!!!
    public SubNoEmptyYesParamApp() {
        super("sdfv");
        this.childName = childName;
    }

    public static void main(String[] args) {
        new SubNoEmptyYesParamApp(1);
    }
}

class ParentNoEmptyYesParam {
    private int i;

    public ParentNoEmptyYesParam(int i) {
        System.out.println("parent constructor + i");
        this.i = i;
    }

    public ParentNoEmptyYesParam(String i) {
        System.out.println("parent constructor");

    }
}
