package i.ua.mail100.operators;

public class OperatorTest {
    public static void main(String[] args) {
        int i = 5;
        i++;
        System.out.println(i++);  // 6

        int a = 10;
        int b = 20;
        System.out.println(a = b);  // 20

        System.out.println("null == null : " + (null == null));  // true

        int num1 = 12;
        double num2 = 17.8;
        boolean eJavaResult = true;
        boolean returnVal = num1 >= 12 && num2 < 4.567//Line
                || eJavaResult == true;
        System.out.println("num1>=12&&num2<4.567 || eJavaResult==true : " + returnVal);


        int num = 9;
        if (num % 3 == 0)
            System.out.println(true);
        else System.out.println(false);


        int number = 10;
        if ((number = number + 10) == 10)
            System.out.print(number);
        if ((number = number - 10) == 10)
            System.out.print(number +70);
        else System.out.print(20);
        System.out.println();


        System.out.println(12345+5432l);


//        int i3 = 0; if(i3) { System.out.println("Hello");}
        boolean b3 = true; boolean b2 = true; if(b3==b2){ System.out.println("So true");}
        int i4 = 1; int j = 2; if(i4==1 || j ==2) System.out.println("OK");
//        int i5 = 1; int j = 2; if(i5==1 &| j ==2) System.out.println("OK");


    }
}
