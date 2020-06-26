package i.ua.mail100.finalizer;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.StringTokenizer;


//http://www.frolov-lib.ru/programming/javasamples/vol1/vol1_9/src1.htm
public class Finalizer {
    static DataOutputStream os;

    public static void main(String args[]) {
        int i;
        byte bKbd[] = new byte[256];
        String szStr = "";
        StringTokenizer st;

        try {
            os = new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream("log.txt")));
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

        System.out.println("Enter any number (777 to terminate, 0 to generate exeption):");

        try {
            while (true) {
                int iCnt = System.in.read(bKbd);
                szStr = new String(bKbd, 0, iCnt);

                st = new StringTokenizer(szStr, "\r\n");
                szStr = new String((String) st.nextElement());

                Integer intVal = new Integer(szStr);
                i = intVal.intValue();

                if (i == 777) break;
                i = 100 / i;
                os.writeBytes(i + " ");
                System.out.println(i + " ");
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            try {
                System.out.println("close");
                os.close();
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
        }
        System.out.println("Ready!");
    }
}