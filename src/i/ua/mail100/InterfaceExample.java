package i.ua.mail100;

public interface InterfaceExample extends Comparable{
    public static final int FIELD1 = 1;
    public int FIELD2 = 1;
    String string = "kjbbkjb";


    public void methodNoBody1();

    public void methodNoBody2();


    private void methodBody1(){
        System.out.println("methodBody1");
    }

    default void methodBody2(){
        System.out.println("methodBody1");
    }

    default void methodBody3(){
        System.out.println("methodBody2");
    }







}
