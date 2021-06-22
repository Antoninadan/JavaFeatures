package i.ua.mail100.publicprivate;

public class ClassChild extends ClassParent{
    public int publicFieldChild;
    public static int publicStaticFieldChild;
    protected int protectedFieldChild;
    int intPackegeChild;
    private int privateFieldChild;
    private static int privateStaticFieldChild;

    public void publicMethodChild(){
        System.out.println("public method from ClassPChild");
    }
    protected void protectedMethodChild(){
        System.out.println("protected method from ClassChild");
    }
    void packageMethodChild(){
        System.out.println("package method from ClassChild");
    }
    private void privateMethodChild(){
        System.out.println("private method from ClassChild");
    }

    public static void main(String[] args) {
        privateStaticFieldChild = 1;
        publicStaticFieldParent = 1;
    }

    public void nonStaticMethodChild(){
        publicFieldParent = 1;
        protectedFieldParent = 1;
        packageFieldParent = 1;

        publicMethodParent();
        protectedMethodParent();
        packageMethodParent();
    }
}

// follow