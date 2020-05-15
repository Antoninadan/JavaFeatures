package i.ua.mail100.innerclasses;

import i.ua.mail100.interfaces.InterfaceClassExample;
import i.ua.mail100.interfaces.InterfaceExample;

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
