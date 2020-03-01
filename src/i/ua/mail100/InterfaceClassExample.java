package i.ua.mail100;

public class InterfaceClassExample implements InterfaceExample {

    @Override
    public void methodNoBody1(){

    }

    @Override
    public void methodNoBody2() {

    }

    @Override
    public void methodBody2() {

    }

    @Override
    public void methodBody3() {

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public static void main(String[] args) {
        InterfaceClassExample interfaceClassExample = new InterfaceClassExample();
        interfaceClassExample.methodBody1();


        }
}
