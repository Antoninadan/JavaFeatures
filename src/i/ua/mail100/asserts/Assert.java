package i.ua.mail100.asserts;

import java.io.Serializable;

public class Assert {
    public static void main(String[] args) {
        boolean status = false;
        assert status == true : "message if error";
    }
}