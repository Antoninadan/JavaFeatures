package i.ua.mail100.clonables;

public class ClonableExampleClass implements Cloneable {
    int a;
    String s;
    final int immutable = 1000;
    final A mutable = new A();

    class A {
        @Override
        public String toString() {
            return "A{}";
        }
    }


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
                ", immutable=" + immutable +
                ", mutable=" + mutable +
                '}';
    }

    @Override
    protected ClonableExampleClass clone() throws CloneNotSupportedException {
        ClonableExampleClass result = null;

        try {
            result.setA(this.a);
            result.setS(this.s);
            return (ClonableExampleClass) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

}
