package i.ua.mail100.compileruntime;

public class Binding {
    public static void main(String[] args) {
        Parent parent = new Child(1, "");//Child(child + parent)

        // runtime
        parent.parentMethod();

        // compile
        parent.parentMethodOne(2, "", 5);

        // test overload
        new Parent("", 4);
        new Parent( 4, "");

    }
}

class Parent {

    public Parent(String name, int age) {
        System.out.println("name age");
    }

    public Parent(int age, String name) {
        System.out.println("age name");

    }

    void parentMethod() {

    }

    void parentMethodOne(int a, String name) {

    }

    void parentMethodOne(String name, int a) {

    }

    void parentMethodOne(int a, String name, int r) {

    }



}

class Child extends Parent {

    public Child(int age, String name) {
        super(age, name);
    }

    @Override
    void parentMethod() {

    }

}
