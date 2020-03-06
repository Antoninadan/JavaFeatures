package i.ua.mail100;

public class ObjectMethodsExample implements Cloneable {
    int field;

    public ObjectMethodsExample(int field) {
        this.field = field;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Integer.toUnsignedLong(field);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        else if (obj == null) return false;
        else if (this.getClass() != obj.getClass()) return false;

        ObjectMethodsExample b = (ObjectMethodsExample) obj;
        if (b.field == this.field) return true;
        else return false;
    }

    @Override
    protected ObjectMethodsExample clone() throws CloneNotSupportedException {
        return (ObjectMethodsExample) super.clone();
    }

    @Override
    public String toString() {
        return "override " + Integer.toString(field);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Call finalize: " + this.getClass());
    }
}
