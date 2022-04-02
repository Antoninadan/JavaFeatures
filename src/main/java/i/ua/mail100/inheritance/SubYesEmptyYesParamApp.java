package i.ua.mail100.inheritance;

public class SubYesEmptyYesParamApp extends ParentYesEmptyYesParamTwo {

    public static void main(String[] args) {
        SubYesEmptyYesParamApp one =new SubYesEmptyYesParamApp();
    }
}

class ParentYesEmptyYesParam {

    public ParentYesEmptyYesParam() {
        System.out.println("parent constructor empty param");
    }

    public ParentYesEmptyYesParam(int i) {
        System.out.println("parent constructor with param");
    }
}
