package i.ua.mail100;

public class ExceptionSelfExample extends Exception{
    @Override
    public String getMessage(){
        return " Subclass exceptions created";
    }

}
