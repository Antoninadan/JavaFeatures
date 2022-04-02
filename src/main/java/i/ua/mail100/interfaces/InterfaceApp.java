package i.ua.mail100.interfaces;

public class InterfaceApp {
    public static void main(String[] args) {
        int a = InterfaceExample.FIELD2;
        InterfaceImpl interfaceImpl = new InterfaceImpl();
        interfaceImpl.defaultMethod();
    }
}
