package i.ua.mail100.finals;

import java.util.ArrayList;
import java.util.List;

public class FinalMethodArgs {

    public static void main(String args[]) {
        FinalMethodArgs obj = new FinalMethodArgs();
        obj.myMethod(10, "BeginnersBook.com");
    }

    public void myMethod(int num, final String str) {
        // This is allowed as num is not final
        num = num + 10;

        /* This is not allowed as String str is final and
         * we cannot change the value of final parameter.
         * we can just use it without modifying its value.
         */
//        str = str+"XYZ";

        System.out.println(num + str);
    }

    public void myMethodTwo(int num, final List<String> strings) {
        // This is allowed as num is not final
        num = num + 10;

        // not allowed
//        strings = new ArrayList<>();
    }

}