package i.ua.mail100.bigdecimal;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDecimalRunner {
    public static void main(String[] args) {
        // constructors:
        BigInteger integer = new BigInteger("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        System.out.println("integer = " + integer);

        BigDecimal decimal = new BigDecimal("1234444444444444444444444444.444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        System.out.println("decimal = " + decimal);

        BigInteger i1 = BigInteger.valueOf(3333);
        System.out.println("i1 = " + i1);



        // test immutable:
        integer.add(BigInteger.valueOf(33333333));
        System.out.println("integer.add(BigInteger.valueOf(33333333)) = " + integer);
        // need new object
        BigInteger result = integer.add(BigInteger.valueOf(33333333));
        System.out.println("BigInteger result = integer.add(BigInteger.valueOf(33333333)) = " + result);



        // ????????
        long toLong = integer.longValue();
        System.out.println(toLong);


        // equals
        Double a = 1.5;
        Double b = 1.50;

        System.out.println(a.equals(b));

        BigDecimal x = new BigDecimal("1.5");
        BigDecimal y = new BigDecimal("1.50");
        BigDecimal z = new BigDecimal("1.5");

        System.out.println(x.equals(y));
        System.out.println(x.equals(z));

        System.out.println(x.compareTo(y));
    }
}
