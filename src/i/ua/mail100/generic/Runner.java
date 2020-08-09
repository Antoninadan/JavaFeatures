package i.ua.mail100.generic;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        SuperParent superParent = new SuperParent();
        Parent parent = new Parent();
        Child child = new Child();

        gerericExtends(superParent);
        gerericExtends(parent);
        gerericExtends(child);




        List<SuperParent> superParentList = new ArrayList<>();
        List<Parent> parentList = new ArrayList<>();
        List<Child> childList = new ArrayList<>();

        gerericExtends(superParentList);
        gerericExtends(parentList);
        gerericExtends(childList);

        gerericSuper(superParentList);
        gerericSuper(parentList);
//        gerericSuper(childList);

    }

    public static <T extends SuperParent> void gerericExtends(T parametr){
    }

//    public static <T super > void gerericSuper(T parametr){
//    }

    public static void gerericExtends(List<? extends SuperParent> parametr){
    }

    public static void gerericSuper(List<? super Parent> parametr){
    }



}
