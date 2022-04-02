package i.ua.mail100.binding;

public class BindingApp {
    public static void main(String[] args) {

        // Пример статического и динамического связывания в Java
        ParentClass current = new ChildClass();

        // Динамическое связывание на основе объекта
        String s = current.getStrParent();

        // Статическое связывание на основе класса
        String category = current.getParentName();

    }
}

class ParentClass {
    public static final String strParent = "parent";

    public String getStrParent() {
        return strParent;
    }

    public static String getParentName(){
        return "parent class";
    }

}

class ChildClass extends ParentClass {
    public static final String strCld = "child";

    public String getStrParent() {
        return strParent;
    }

    public static String getChildName(){
        return "child class";
    }
}