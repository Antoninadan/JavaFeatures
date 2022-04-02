package i.ua.mail100.references;

import i.ua.mail100.TestClass;

public class ReferenceRunner {

    public static void main(String[] args) {
        Integer a = new Integer(1);
        Integer b = a;
        setInteger(b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        setInteger(a);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = setgetInteger(a);
        System.out.println("a = " + a);
        System.out.println("b = " + b + "\n");


        String aStr = "1111";
        String bStr = aStr;
        setString1(bStr);
        System.out.println("aStr = " + aStr);
        System.out.println("bStr = " + bStr);
        setString1(aStr);
        System.out.println("aStr = " + aStr);
        System.out.println("bStr = " + bStr);
        aStr = setgetString(aStr);
        System.out.println("aStr = " + aStr);
        System.out.println("bStr = " + bStr + "\n");


//        StringBuilder aStrBuilder = new StringBuilder("1111");
//        String bStr2 = aStrBuilder.toString();
//        setString1(bStr2);
//        System.out.println("aStrBuilder = " + aStrBuilder);
//        System.out.println("bStr2 = " + bStr2);
////        setString1(aStrBuilder);
////        System.out.println("aStrBuilder = " + aStrBuilder);
////        System.out.println("bStr2 = " + bStr2);
////        aStr = setgetString(aStrBuilder);
////        System.out.println("aStrBuilder = " + aStrBuilder);
////        System.out.println("bStr2 = " + bStr2 + "\n");


        int aa = 1;
        int bb = aa;
        setInt(bb);
        System.out.println("aa = " + aa);
        System.out.println("bb = " + bb);
        aa = 13;
        System.out.println("aa = " + aa);
        System.out.println("bb = " + bb + "\n");


        // test
        System.out.println("Test F");
        TestClass aClass = new TestClass(1);
        TestClass bClass = aClass;
        System.out.println("aClass.getF() = " + aClass.getF());
        System.out.println("bClass.getF() = " + bClass.getF());
        setTestClassF13(aClass);
        System.out.println("aClass.getF() = " + aClass.getF());
        System.out.println("bClass.getF() = " + bClass.getF() + "\n");


        // test string
        String aString = new String("1");
        String bString = aString;
        setString(bString);
        System.out.println("aString = " + aString);
        System.out.println("bString = " + bString);
        aString = "13";
        System.out.println("aString = " + aString);
        System.out.println("bString = " + bString + "\n");

        // test
        TestClass dClass = new TestClass(1);
        setNewTestClass(dClass);
        System.out.println("dClass.getF() = " + dClass.getF() + "\n");


        // test
        TestClass eClass = new TestClass(1);
        TestClass gClass = eClass;
        eClass = new TestClass(99);
        System.out.println("eClass.getF() = " + eClass.getF());
        System.out.println("gClass.getF() = " + gClass.getF() + "\n");


        Integer aInteger = 1;
        Integer bInteger = 1;
        Integer cInteger = new Integer(1);
        Integer dInteger = new Integer(1);
        int e = 1;
        System.out.println("aInteger.equals(bInteger) = " + aInteger.equals(bInteger));
        System.out.println("aInteger.equals(cInteger) = " + aInteger.equals(cInteger));
        System.out.println("cInteger.equals(dInteger) = " + cInteger.equals(dInteger));
        System.out.println("cInteger.equals(e) = " + cInteger.equals(e) + "\n");
        System.out.println("aInteger.equals(bInteger) = " + (aInteger==bInteger)); //t
        System.out.println("aInteger.equals(cInteger) = " + (aInteger==cInteger)); //f
        System.out.println("cInteger.equals(dInteger) = " + (cInteger==dInteger)); //f
        System.out.println("cInteger.equals(e) = " + (cInteger==e) + "\n"); //t

        TestClass aClass2 = new TestClass(1);
        TestClass bClass2 = new TestClass(1);
        System.out.println("aClass2.equals(bClass2) = " + aClass2.equals(bClass2)+ "\n");


        String str = "297";
        String strNotIntern = new Integer(297).toString();
        String strIntern = new Integer(297).toString().intern();

        System.out.println("str == strNotIntern " + (str == strNotIntern));
        System.out.println("str == strIntern " + (str == strIntern));

    }

    static void setInteger(Integer integer) {
        System.out.println("integer = " + integer);
        integer = 13;
    }

    static Integer setgetInteger(Integer integer) {
        System.out.println("integer = " + integer);
        integer = 13;
        return integer;
    }

    static void setString1(String str) {
        System.out.println("string = " + str);
        str = "13";
    }

    static String setgetString(String str) {
        System.out.println("string = " + str);
        str = "13";
        return str;
    }

    static void setInt(int int1) {
        System.out.println("int = " + int1);
        int1 = 13;
    }

    static void setTestClassF13(TestClass testClass) {
        testClass.setF(13);
    }

    static void setString(String str) {
        str = "13";
    }

    static void setNewTestClass(TestClass testClass) {
        testClass = new TestClass(100);
        testClass.setF(1000);
    }
}
