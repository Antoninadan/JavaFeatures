package i.ua.mail100;

public class AnonymInnerClassExample {
    public static void main(String[] args) {
        InterfaceExample interfaceExample1 = new InterfaceClassExample(){
            @Override
            public void methodNoBody1() {
                super.methodNoBody1();
            }
        };

    }
}
