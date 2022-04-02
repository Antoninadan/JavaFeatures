package i.ua.mail100.interfaces;

public class InterfaceImpl implements InterfaceExample {

    @Override
    public void publicAbstractMethod() {
        System.out.println("my realization");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public static void main(String[] args) {
        InterfaceImpl interfaceImpl = new InterfaceImpl();
        interfaceImpl.defaultMethod();
        }
}
