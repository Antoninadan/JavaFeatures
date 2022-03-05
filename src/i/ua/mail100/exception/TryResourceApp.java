package i.ua.mail100.exception;

import java.io.File;

public class TryResourceApp {
    public static void main(String[] args) {
        try (final A a = new A()) {
        } catch (Exception e) {
        }


    }
}

class A implements AutoCloseable {
    @Override
    public void close() throws Exception {

    }
}