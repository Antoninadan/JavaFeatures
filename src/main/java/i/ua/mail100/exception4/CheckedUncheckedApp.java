package i.ua.mail100.exception4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedUncheckedApp {
    public static void main(String[] args) {
//        // unchecked
//        throw new NullPointerException();


        // checked
        String fileName = "file does not exist";
        File file = new File(fileName);
        try {
            FileInputStream stream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
