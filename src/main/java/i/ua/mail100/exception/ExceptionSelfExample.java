package i.ua.mail100.exception;

public class ExceptionSelfExample extends Exception{
    @Override
    public String getMessage(){
        return " Subclass exceptions created";
    }

}
