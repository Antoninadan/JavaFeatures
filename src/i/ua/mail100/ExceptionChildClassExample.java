package i.ua.mail100;

import java.io.IOException;

public class ExceptionChildClassExample extends ExceptionParentClassExample{
    @Override
    public String test()throws /*Exception,*/ IOException {
        return "Parent class";
    }

}
