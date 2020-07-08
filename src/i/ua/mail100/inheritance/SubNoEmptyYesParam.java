package i.ua.mail100.inheritance;

public class SubNoEmptyYesParam extends ParentNoEmptyYesParam {

    public SubNoEmptyYesParam(int i) {
        super(i);
        System.out.println("sub class constructor");
    }

    // forbidden own without paramentrs
//    public SubNoEmptyYesParam() {
//    }


    public static void main(String[] args) {
        new SubNoEmptyYesParam(1);
    }
}
