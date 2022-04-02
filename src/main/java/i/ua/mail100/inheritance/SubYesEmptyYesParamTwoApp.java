package i.ua.mail100.inheritance;

public class SubYesEmptyYesParamTwoApp extends ParentYesEmptyYesParamTwo {

    public SubYesEmptyYesParamTwoApp(int i, int j) {
        System.out.println("subclass constructor i j ");
    }

    public SubYesEmptyYesParamTwoApp() {
        System.out.println("subclass constructor empty");
    }

    public SubYesEmptyYesParamTwoApp(int i) {
        super(i);
    }

    public static void main(String[] args) {
        SubYesEmptyYesParamTwoApp zero =new SubYesEmptyYesParamTwoApp(1,1);

        System.out.println();
        SubYesEmptyYesParamTwoApp one = new SubYesEmptyYesParamTwoApp(1);

        System.out.println();
        SubYesEmptyYesParamTwoApp two = new SubYesEmptyYesParamTwoApp();
    }
}

class ParentYesEmptyYesParamTwo {

    public ParentYesEmptyYesParamTwo() {
        System.out.println("parent constructor empty param");
    }

    public ParentYesEmptyYesParamTwo(int i) {
        System.out.println("parent constructor with param");
    }
}
