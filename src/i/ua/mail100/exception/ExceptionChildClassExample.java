package i.ua.mail100.exception;

import java.io.IOException;

public class ExceptionChildClassExample extends ExceptionParentClassExample{
    @Override
    public String test()throws /*exception,*/ IOException {
        return "Parent class";
    }

}
