package i.ua.mail100.clonables;

public class NotClonableExampleClass {
    int a;
    String s;

    public NotClonableExampleClass(int a, String s) {
        this.a = a;
        this.s = s;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "NotClonableExampleClass{" +
                "a=" + a +
                ", s='" + s + '\'' +
                '}';
    }

}
