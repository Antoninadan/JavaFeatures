package i.ua.mail100.publicprivate;

public interface InterfaceE {
    public static int publicStaticFieldParent = 1;

    public void publicMethodParent();

    default void packageMethodParent(){
        System.out.println("package method from ClassParent");
    }
    private void privateMethodParent(){
        System.out.println("private method from ClassParent");
    }

}
