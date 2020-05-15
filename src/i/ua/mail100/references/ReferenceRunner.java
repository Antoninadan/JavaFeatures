package i.ua.mail100.references;

import i.ua.mail100.TestClass;

public class ReferenceRunner {

    public static void main(String[] args) {
        Integer a = new Integer(1);
        Integer b = a;
        setInteger(b);
        System.out.println("a = " + b);
        System.out.println("b = " + b + "\n");


        // test
        TestClass aClass = new TestClass(1);
        TestClass bClass = aClass;
        setTestClass(bClass);
        System.out.println("aClass.getA() = " + aClass.getA());
        System.out.println("bClass.getA() = " + bClass.getA()+ "\n");


        // test string - not change
        String aString = new String("1");
        String bString = aString;
        setString(bString);
        System.out.println("aString = " + aString);
        System.out.println("bString = " + bString + "\n");


        // test
        TestClass dClass = new TestClass(1);
        setNewTestClass(dClass);
        System.out.println("dClass.getA() = " + dClass.getA() + "\n" );


        // test
        TestClass eClass = new TestClass(1);
        TestClass gClass = eClass;
        eClass = new TestClass(99);
        System.out.println("eClass.getA() = " + eClass.getA());
        System.out.println("gClass.getA() = " + gClass.getA()+ "\n");



        Integer aInteger = 1;
        Integer bInteger = 1;
        Integer cInteger = new Integer(1);
        Integer dInteger = new Integer(1);
        int e = 1;
        System.out.println("aInteger.equals(bInteger) = " + aInteger.equals(bInteger));
        System.out.println("aInteger.equals(cInteger) = " + aInteger.equals(cInteger));
        System.out.println("cInteger.equals(dInteger) = " + cInteger.equals(dInteger));
        System.out.println("cInteger.equals(e) = " + cInteger.equals(e)+ "\n");


        TestClass aClass2 = new TestClass(1);
        TestClass bClass2 = new TestClass(1);
        System.out.println("aClass2.equals(bClass2) = " + aClass2.equals(bClass2));


        String str = "34234" +"nkljkj";
        System.out.println("str.intern() = " + str.intern());

    }

    static void setInteger(Integer integer){
        integer = 13;
    }

    static void setTestClass(TestClass testClass){
        testClass.setA(13);
    }

    static void setString(String str){
        str = "13";
    }

    static void setNewTestClass(TestClass testClass){
        testClass = new TestClass(100);
        testClass.setA(1000);
    }
}
