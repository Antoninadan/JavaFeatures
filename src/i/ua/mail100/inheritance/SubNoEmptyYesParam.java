package i.ua.mail100.inheritance;

public class SubNoEmptyYesParam extends ParentNoEmptyYesParam {
    private String childName;

    public SubNoEmptyYesParam(int i) {
        super(i);
        System.out.println("sub class constructor");
    }

// attention!!!
    public SubNoEmptyYesParam() {
        super("sdfv");
        this.childName = childName;
    }




    public static void main(String[] args) {
        new SubNoEmptyYesParam(1);
    }
}
