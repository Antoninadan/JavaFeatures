package i.ua.mail100.reflection;

import java.lang.reflect.Modifier;

public class ReflectionExample {
    public static String getModifiers(Object object)
    {
        Class<?> fileClass = object.getClass();
        int mod = fileClass.getModifiers();

        return "Class name = " + fileClass.getName()
                +  (Modifier.isPublic(mod) == true ? " \n public " : "")
                +  (Modifier.isProtected(mod) == true ? "\n protected " : "")
                +  (Modifier.isPrivate(mod) == true ? "\n private " : "")
                +  (Modifier.isStatic(mod) == true ? "\n static " : "")
                +  (Modifier.isFinal(mod) == true ? "\n final " : "")
                +  (Modifier.isAbstract(mod) == true ? "\n abstract " : "");
    }
}
