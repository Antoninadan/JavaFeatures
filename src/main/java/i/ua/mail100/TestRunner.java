package i.ua.mail100;

public class TestRunner {
    public static void main(String[] args) {

       int myList [] = {4, 3, 7};

      char c1 = 064770;
//      char c2 = 'face';
      char c3 = 0xbeef;
//      char c4 = \u0022;
//      char c5 = '\iface';
      char c6 = '\uface';

//        try {
//            int x = 0;
//            int y = 5 / x;
//        } catch (exception e) {
//            System.out.println("exception");
//        } catch (ArithmeticException ae) {
//            System.out.println("Arithmetic exception");
//        }
//        System.out.println("finished");

        int num =10;
        do{
            System.out.println(num);
            num++;
            System.out.println(num);
        } while(++num>20);
        System.out.println(num);

        if (null == null) {
            System.out.println("null == null");
        }



    }
}
