package i.ua.mail100.clonables;

public class ClonableExampleClass implements Cloneable {
    int a;
    String s;

    public ClonableExampleClass(int a, String s) {
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
        return "ClonableExampleClass{" +
                "a=" + a +
                ", s='" + s + '\'' +
                '}';
    }

    @Override
    protected ClonableExampleClass clone() throws CloneNotSupportedException {

        try {
            return (ClonableExampleClass) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

}
