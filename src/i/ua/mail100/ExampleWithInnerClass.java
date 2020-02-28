package i.ua.mail100;

import java.util.Collections;

public class ExampleWithInnerClass extends Assert {
    private static int staticField;
    private int nonStaticField;


    class InnerClass extends InterfaceMarkers {
        //        static int a;                           // inner class doesnt support static declaration
        void method() {
            staticField = 90;
            nonStaticField = 100;
        }

//        static InnerClass getInstance(){    // inner class doesnt support static declaration
//        }
    }

    static class StaticInnerClass extends InterfaceMarkers {
        void method() {
//            nonStaticField = 100;
            staticField = 90;
            ExampleWithInnerClass exampleWithInnerClass = new ExampleWithInnerClass();
            exampleWithInnerClass.nonStaticField = 100;
        }
    }

    public static void main(String[] args) {
        InnerClass innerClass;
        StaticInnerClass staticInnerClass = new StaticInnerClass();
    }
}
