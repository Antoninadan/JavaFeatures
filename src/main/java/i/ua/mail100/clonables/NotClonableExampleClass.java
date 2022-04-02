package i.ua.mail100.clonables;

public final class NotClonableExampleClass implements Cloneable{
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
    protected NotClonableExampleClass clone() throws CloneNotSupportedException {
        return (NotClonableExampleClass) super.clone();
    }

    @Override
    public String toString() {
        return "NotClonableExampleClass{" +
                "a=" + a +
                ", s='" + s + '\'' +
                '}';
    }
}
