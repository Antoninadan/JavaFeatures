package i.ua.mail100.modificators.packageOne;

class PackageClassOne {
    public String publicString = "publicString";
    protected String protectedString = "protectedString";
    String defaultString = "packageString";
    private String privateString = "privateString";

    public void publicMethod(){
        System.out.println("Public method");
    }

    protected void protectedMethod(){
        System.out.println("Protected method");
    }

    void packageMethod(){
        System.out.println("Default method");
    }

    private void privateMethod(){
        System.out.println("Private method");
    }

    public static void main(String[] args) {
        PackageClassOne packageClassOne = new PackageClassOne();
        System.out.println(packageClassOne.privateString);
        packageClassOne.privateMethod();
    }



}
