package i.ua.mail100;

public class Reference {

    static void setInteger(Integer integer){
        integer = 13;
    }

    static void setTestClass(TestClass testClass){
        testClass.setA(13);
    }



    public static void main(String[] args) {
        Integer a = new Integer(1);
        Integer b = a;
        setInteger(b);
        System.out.println("a = " + b);
        System.out.println("b = " + b);


        TestClass aClass = new TestClass(1);
        TestClass bClass = aClass;
        setTestClass(bClass);
        System.out.println("aClass.getA() = " + aClass.getA());
        System.out.println("bClass.getA() = " + bClass.getA());


        Integer aInteger = 1;
        Integer bInteger = 1;
        Integer cInteger = new Integer(1);
        Integer dInteger = new Integer(1);
        int e = 1;
        System.out.println("aInteger.equals(bInteger) = " + aInteger.equals(bInteger));
        System.out.println("aInteger.equals(cInteger) = " + aInteger.equals(cInteger));
        System.out.println("cInteger.equals(dInteger) = " + cInteger.equals(dInteger));
        System.out.println("cInteger.equals(e) = " + cInteger.equals(e));


        TestClass aClass2 = new TestClass(1);
        TestClass bClass2 = new TestClass(1);
        System.out.println("aClass2.equals(bClass2) = " + aClass2.equals(bClass2));
    }
}
