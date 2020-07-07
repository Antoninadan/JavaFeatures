package i.ua.mail100.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;

public class ExceptionSmartRunner {

    public void printMessage() throws IOException{
        try {
            if (1 == 1) {
                // можно не обрабатывать, так как не вылетит
                throw new FileNotFoundException();
            }
            throw new NullPointerException();
        }
        finally {
            //выбросит из finally
            throw new IOException();
        }
    }

    public void getPatient()  throws IOException{
        throw new IOException();
        // не достигнет -  "Unreachable statement"
//        throw new NullPointerException();
    }

    protected void getClient() throws FileNotFoundException, IOException {
        try {
            throw new FileNotFoundException();
        } finally {
            throw new IOException();
        }
        // не достигнет -  "Unreachable statement"
//        throw new NullPointerException();
    }

    public static int getMessage() {
        try {
            return 1;
        } catch (IllegalArgumentException | NullPointerException e) {

        } finally {
            // return from FINALLY
            return 2;
        }

    }

    public Object getFileName(Path path) throws FileNotFoundException {
        File file = new File("./Text.txt");
        return file;
    }


    public static void main(String[] args) throws FileNotFoundException, IOException {
        System.out.println(getMessage());

        ExceptionSmartRunner aTry = new ExceptionSmartRunner();
        try {
            aTry.getClient();

            // в catch сделать обработку всего, что реально может вылететь для метода
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
