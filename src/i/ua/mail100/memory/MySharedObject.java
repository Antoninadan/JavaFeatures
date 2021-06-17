package i.ua.mail100.memory;

public class MySharedObject {
    //статическая переменная, указывающая на экземпляр MySharedObject
    public static final MySharedObject sharedInstance = new MySharedObject();

    // переменные-члены, указывающие на два объекта в куче
    public Integer object2 = new Integer(22);
    public Integer object4 = new Integer(44);

    public long member1 = 12345;
    public long member2 = 67890;
}
