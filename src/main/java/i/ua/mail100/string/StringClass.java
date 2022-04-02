package i.ua.mail100.string;

public class StringClass {
    public static void main(String[] args) {

        String str1 = new String("abc");
        String str2 = new String("abc");
        String str3 = "abc";
        String str4 = "abc";

        System.out.println("new string(\"abc\") == new string(\"abc\"): " + (str1 == str2));
        System.out.println("\"abc\" == \"abc\": " + (str3 == str4));
        System.out.println();

        StringBuffer stringBuffer1 = new StringBuffer("abc");
        System.out.println("stringBuffer1.reverse() = " + stringBuffer1.reverse().toString());


    }
}
