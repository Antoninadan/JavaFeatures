package i.ua.mail100.inheritance;

public class SubYesEmptyYesParamTwo extends ParentYesEmptyYesParam{

    public SubYesEmptyYesParamTwo(int i, int j) {
        System.out.println("subclass constructor i j ");
    }

    public SubYesEmptyYesParamTwo() {
        System.out.println("subclass constructor empty");
    }

    public SubYesEmptyYesParamTwo(int i) {
        super(i);
    }

    public static void main(String[] args) {
        SubYesEmptyYesParamTwo zero =new SubYesEmptyYesParamTwo(1,1);

        System.out.println();
        SubYesEmptyYesParamTwo one = new SubYesEmptyYesParamTwo(1);

        System.out.println();
        SubYesEmptyYesParamTwo two = new SubYesEmptyYesParamTwo();
    }
}
