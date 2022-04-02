package i.ua.mail100.modificators.packageTwo;

public class ClassTwo{
    public String publicString = "publicString";
    protected String protectedString = "protectedString";
    String defaultString = "defaultString";
    private String privateString = "privateString";

    public void publicMethod(){
        System.out.println("Public method - parent");
    }

    protected void protectedMethod(){
        System.out.println("Protected method - parent");
    }

    void packageMethod(){
        System.out.println("Default method - parent");
    }

    private void privateMethod(){
        System.out.println("Private method - parent");
    }
}
