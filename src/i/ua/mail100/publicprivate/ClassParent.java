package i.ua.mail100.publicprivate;

public class ClassParent {
    public int publicFieldParent;
    public static int publicStaticFieldParent;
    protected int protectedFieldParent;
    int packageFieldParent;
    private int privateFieldParent;
    private static int privateStaticFieldParent;

    public void publicMethodParent(){
        System.out.println("public method from ClassParent");
    }
    protected void protectedMethodParent(){
        System.out.println("protected method from ClassParent");
    }
    void packageMethodParent(){
        System.out.println("package method from ClassParent");
    }
    private void privateMethodParent(){
        System.out.println("private method from ClassParent");
    }

    public static void main(String[] args) {
        privateStaticFieldParent = 1;
    }
}
